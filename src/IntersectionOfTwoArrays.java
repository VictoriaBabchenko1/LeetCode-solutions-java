import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        for (int val : nums1) {
            nums1Set.add(val);
        }

        for (int val : nums2) {
            if(nums1Set.contains(val)){
                nums2Set.add(val);
            }
        }

        int[] result = new int[nums2Set.size()];
        int i =0;
        for (int val : nums2Set) {
            result[i] = val;
            i++;
        }

        return result;
    }
}
