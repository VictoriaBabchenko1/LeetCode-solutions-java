package solutions;

import java.util.ArrayList;
import java.util.List;

public class SeparateDigitsInAnArray {
    public int[] separateDigits(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int num : nums) {
            List<Integer> numDigits = new ArrayList<>();
            while(num > 0) {
                numDigits.add(num % 10);
                num /= 10;
            }

            for(int i = numDigits.size()-1; i >= 0; i--) {
                res.add(numDigits.get(i));
            }
        }

        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}
