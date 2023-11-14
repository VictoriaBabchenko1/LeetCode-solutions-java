public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for(int i = 0; i < numbers.length && num > 0; i++){
            while(num >= numbers[i]){
                num -= numbers[i];
                result.append(romans[i]);
            }
        }

        return result.toString();
    }
}
