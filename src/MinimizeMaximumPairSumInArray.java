import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int minMaxPairSum = 0;
        for(int i = 0; i < nums.length / 2; i++){
            minMaxPairSum = Math.max(minMaxPairSum, nums[i] + nums[nums.length - i - 1]);
        }

        return minMaxPairSum;
    }
}
