package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        String[] strs = new String[n];
        for(int i = 1; i <= n; i++){
            strs[i - 1] = Integer.toString(i);
        }
        Arrays.sort(strs);
        for(String str : strs){
            result.add(Integer.parseInt(str));
        }
        return result;
    }
}
