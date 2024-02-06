package solutions;

import java.util.ArrayList;
import java.util.List;

public class SplitStringsBySeparator {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        for(String word : words) {
            String[] separated = word.split("\\Q" + separator + "\\E");
            for(String splitWord : separated){
                if (!splitWord.isEmpty()) {
                    result.add(splitWord);
                }
            }
        }

        return result;
    }
}
