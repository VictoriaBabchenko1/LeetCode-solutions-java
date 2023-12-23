package solutions;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String >> map = new HashMap<>();

        for(String word : strs){
            char tempArray[] = word.toCharArray();
            Arrays.sort(tempArray);
            String sortedWord = new String(tempArray);

            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
