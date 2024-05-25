package solutions;

public class FindTheArrayConcatenationValue {
    public long findTheArrayConcVal(int[] nums) {
        long res = 0;

        for(int i = 0; i < nums.length / 2; i++) {
            res += Long.parseLong(String.valueOf(nums[i]) + String.valueOf(nums[nums.length-1-i]));
        }

        if(nums.length % 2 != 0) {
            res += nums[nums.length / 2];
        }

        return res;
    }
}
