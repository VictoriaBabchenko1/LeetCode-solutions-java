package solutions;

import java.util.HashSet;
import java.util.Set;

public class GreatestEnglishLetterInUpperAndLowerCase {
    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()) {
            set.add(ch);
        }

        for(char ch = 'Z'; ch >= 'A'; ch--) {
            if(set.contains(ch) && set.contains((char)(ch + 32))) {
                return "" + ch;
            }
        }

        return "";
    }
}
