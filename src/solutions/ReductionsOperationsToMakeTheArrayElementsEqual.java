package solutions;

import java.util.Arrays;

public class ReductionsOperationsToMakeTheArrayElementsEqual {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int res = 0;

        for(int i  = nums.length - 1; i > 0; i--){
            if(nums[i] != nums[i - 1]){
                res += len - i;
            }
        }

        return  res;
    }
}
