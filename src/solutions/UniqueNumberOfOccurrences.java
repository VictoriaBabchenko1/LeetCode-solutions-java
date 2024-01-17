package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (Integer val : map.values()){
            if(list.contains(val)){
                return false;
            }
            else {
                list.add(val);
            }
        }

        return true;
    }
}
