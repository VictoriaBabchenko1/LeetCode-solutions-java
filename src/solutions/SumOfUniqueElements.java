package solutions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        for(Map.Entry entry : map.entrySet()){
            if(entry.getValue().equals(1)){
                sum += (int)entry.getKey();
            }
        }

        return sum;
    }
}
