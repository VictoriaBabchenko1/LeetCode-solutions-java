package solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        for(int n : nums1) {
            nums1Set.add(n);
        }

        for(int n : nums2) {
            nums2Set.add(n);
        }

        List<Integer> num1Result = new ArrayList<>();
        List<Integer> num2Result = new ArrayList<>();

        for(int n : nums1Set) {
            if(!nums2Set.contains(n)) {
                num1Result.add(n);
            }
        }

        for(int n : nums2Set) {
            if(!nums1Set.contains(n)) {
                num2Result.add(n);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(num1Result);
        result.add(num2Result);

        return result;
    }
}
