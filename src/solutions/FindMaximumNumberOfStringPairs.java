package solutions;

import java.util.Objects;

public class FindMaximumNumberOfStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        int res = 0;
        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i; j < words.length; j++) {
                if(words[i].equals(new StringBuilder(words[j]).reverse().toString())) {
                    res++;
                }
            }
        }

        return res;
    }
}
