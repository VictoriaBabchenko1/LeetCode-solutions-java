package solutions;

import java.util.HashMap;
import java.util.Map;

public class CustomSortString {
    public String customSortString(String order, String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for(char ch : order.toCharArray()) {
            if(charCount.containsKey(ch)) {
                int count = charCount.get(ch);
                while (count-- > 0) {
                    result.append(ch);
                }
                charCount.remove(ch);
            }
        }

        for(char ch : charCount.keySet()) {
            int count = charCount.get(ch);
            while (count-- > 0) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
