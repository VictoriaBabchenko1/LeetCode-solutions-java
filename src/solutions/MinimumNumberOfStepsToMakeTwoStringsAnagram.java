package solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    public int minSteps(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int res = 0;
        for(int i = 0; i < t.length(); i++){
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) > 0){
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }
            else{
                res++;
            }
        }

        return res;
    }
}
