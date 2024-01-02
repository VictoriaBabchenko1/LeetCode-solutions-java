package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertAnArrayIntoA2DArrayWithConditions {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int val : nums){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();

        while (!map.isEmpty()){
            List<Integer> valuesToAdd = new ArrayList<>();
            List<Integer> valuesToRemove = new ArrayList<>();

            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                int key = entry.getKey();
                int value = entry.getValue();
                valuesToAdd.add(key);
                value--;
                map.put(key, value);
                if(value == 0){
                    valuesToRemove.add(entry.getKey());
                }
            }

            for(int val : valuesToRemove){
                map.remove(val);
            }

            result.add(valuesToAdd);
        }

        return result;
    }
}
