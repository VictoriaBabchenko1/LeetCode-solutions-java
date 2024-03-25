package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int x : nums) {
            boolean f = hs.add(x);
            if(!f) result.add(x);
        }
        return result;

//        List<Integer> result = new ArrayList<>();
//        Arrays.sort(nums);
//        for(int i = 0; i < nums.length - 1; i++) {
//            if(nums[i] == nums[i + 1]) {
//                result.add(nums[i]);
//            }
//        }
//        return result;
    }
}
