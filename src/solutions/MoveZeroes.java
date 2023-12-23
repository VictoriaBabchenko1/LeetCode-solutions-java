package solutions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;

        for(int num : nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }

        while (i < nums.length){
            nums[i] = 0;
            i++;
        }

        //System.out.println(Arrays.toString(nums));
    }
}
