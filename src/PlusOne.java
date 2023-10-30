import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9 && i == 0){
                digits[0] = 0;
                int[] array = new int[digits.length + 1];
                System.arraycopy(digits, 0, array, 1, digits.length);
                array[0] = 1;
                return array;
            }
            if(digits[i] == 9){
                digits[i] = 0;
            }
            else{
                digits[i] += 1;
                break;
            }
        }
        return digits;
    }
}
