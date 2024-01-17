package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(map.values());

        return set.size() == map.size();
    }
}
