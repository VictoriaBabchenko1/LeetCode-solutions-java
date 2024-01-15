package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            result.add(i);
        }
        result.sort((a, b) -> (Integer.toString(a).compareTo(Integer.toString(b))));
        return result;
    }
}
