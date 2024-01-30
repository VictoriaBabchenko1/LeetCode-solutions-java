package solutions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int maxFrequency = 0;
        for (int value : map.values()) {
            maxFrequency = Math.max(maxFrequency, value);
        }

        int res = 0;
        for (int val : map.values()) {
            if(val == maxFrequency){
                res += val;
            }

        }

        return res;
    }
}
