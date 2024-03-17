package solutions;

import java.util.Arrays;

public class MaximumSumWithExactlyKElements {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int result = nums[nums.length - 1];
        for(int i = 1; i < k; i++) {
            result += nums[nums.length - 1] + i;
        }
        return result;
    }
}
