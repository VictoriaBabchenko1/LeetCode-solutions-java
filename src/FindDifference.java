import java.util.*;

public class FindDifference {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char sChar : s.toCharArray()) c ^= sChar;
        for(char tChar : t.toCharArray()) c ^= tChar;
        return c;
    }
}
