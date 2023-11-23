public class StriclyPalindromicNumber {

    private String convert(int number, int base){
        StringBuilder result = new StringBuilder();
        while (number != 0){
            result.insert(0, number % base);
            number /= base;
        }

        return result.toString();
    }

    private boolean isPalindrome(String x){
        Integer len = x.length();

        for(int i = 0; i < len / 2; i++){
            if(x.charAt(i) != x.charAt(len - i - 1)){
                return false;
            }
        }

        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i <= n - 2; i++){
            String num = convert(n, i);
            if(!isPalindrome(num)){
                return false;
            }
        }

        return true;
    }
}
