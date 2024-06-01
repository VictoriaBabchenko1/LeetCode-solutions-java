package solutions;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hs = new HashMap<>();

        for(char ch : magazine.toCharArray()) {
            hs.put(ch, hs.getOrDefault(ch, 0) + 1);
        }

        for(char ch : ransomNote.toCharArray()) {
            if(hs.containsKey(ch) && hs.get(ch) > 0) {
                hs.put(ch, hs.get(ch) - 1);
            }
            else {
                return false;
            }
        }

        return true;
    }
}
