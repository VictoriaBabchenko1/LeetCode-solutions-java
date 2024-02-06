package solutions;

import java.util.ArrayList;
import java.util.List;

public class SplitStringsBySeparator {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        for(String word : words) {
            StringBuilder separatedWord = new StringBuilder();
            for(int i = 0; i < word.length(); i++){

                if(word.charAt(i) != separator){
                    separatedWord.append(word.charAt(i));
                }
                else if (!separatedWord.isEmpty()) {
                    result.add(separatedWord.toString());
                    separatedWord = new StringBuilder();
                }
            }
            if (!separatedWord.isEmpty()) {
                result.add(separatedWord.toString());
            }
        }

        return result;
    }
}
