package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortVowelsInAString {
    public String sortVowels(String s) {
        List<Character> strVowels = new ArrayList<>();

        for(char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                strVowels.add(ch);
            }
        }

        strVowels.sort(Collections.reverseOrder());

        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1 ){
                result.append(strVowels.get(strVowels.size() - 1));
                strVowels.remove(strVowels.size() - 1);
            }
            else{
                result.append(ch);
            }
        }

        return result.toString();
    }
}
