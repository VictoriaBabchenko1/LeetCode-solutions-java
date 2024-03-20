package solutions;

import java.util.HashSet;
import java.util.Set;

public class MinimizeStringLength {
    public int minimizedStringLength(String s) {
        Set<Character> sChars = new HashSet<>();
        for(char ch : s.toCharArray()) {
            sChars.add(ch);
        }
        return sChars.size();
    }
}
