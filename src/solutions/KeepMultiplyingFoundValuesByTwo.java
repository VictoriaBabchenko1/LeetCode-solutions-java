package solutions;

import java.util.HashSet;
import java.util.Set;

public class KeepMultiplyingFoundValuesByTwo {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> numSet = new HashSet<>();

        for(int num : nums) {
            numSet.add(num);
        }

        while(numSet.contains(original)) {
            original *= 2;
        }

        return original;
    }
}
