package solutions;

public class NeitherMinimumNorMaximum {
    public int findNonMinOrMax(int[] nums) {
        int max = 0;
        int min = 0;

        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }

        for(int num : nums) {
            if(num != max && num != min) {
                return num;
            }
        }

        return -1;
    }
}
