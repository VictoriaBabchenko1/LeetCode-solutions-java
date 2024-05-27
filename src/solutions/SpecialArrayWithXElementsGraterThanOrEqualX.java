package solutions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SpecialArrayWithXElementsGraterThanOrEqualX {
    public int specialArray(int[] nums) {
        int len = nums.length;

        for(int i = 0; i <= len; i++) {
            int count = 0;
            for(int num : nums){
                if(num >= i) {
                    count++;
                }
            }
            if(i == count) {
                return i;
            }
        }

        return -1;
    }
}
