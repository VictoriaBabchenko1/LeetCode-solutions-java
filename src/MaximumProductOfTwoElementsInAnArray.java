import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
//        int res = 0;
//        for(int i = 0; i < nums.length; i++){
//            for (int j = i + 1; j < nums.length; j++){
//                if((nums[i] - 1) * (nums[j] - 1) > res){
//                    res = (nums[i] - 1) * (nums[j] - 1);
//                }
//            }
//        }
//        return res;
    }
}
