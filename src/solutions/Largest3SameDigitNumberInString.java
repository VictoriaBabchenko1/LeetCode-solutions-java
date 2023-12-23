package solutions;

public class Largest3SameDigitNumberInString {
    public String largestGoodInteger(String num) {
        String result = "";

        for(int i = 2; i < num.length(); i++){
            if(num.charAt(i) == num.charAt(i - 1) && num.charAt(i) == num.charAt(i - 2)){
                if(result.compareTo(num.substring(i - 2, i + 1)) < 0){
                    result = num.substring(i - 2, i + 1);
                }
            }
        }
        return result;
    }
}
