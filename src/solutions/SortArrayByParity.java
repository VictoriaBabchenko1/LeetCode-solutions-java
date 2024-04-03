package solutions;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(int num : nums) {
            if(num % 2 == 0) {
                even.add(num);
            }
            else {
                odd.add(num);
            }
        }

        int[] result = new int[nums.length];
        int i = 0;

        for(int num : even) {
            result[i++] = num;
        }

        for(int num : odd) {
            result[i++] = num;
        }

        return result;
    }
}
