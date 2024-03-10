package solutions;

import java.util.List;

public class CheckIfAStringIsAnAcronymOfWords {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            sb.append(word.charAt(0));
        }
        return sb.toString().equals(s);

//        if(words.size() != s.length()){
//            return false;
//        }
//
//        for(int i = 0; i < words.size(); i++){
//            if(words.get(i).charAt(0) != s.charAt(i)){
//                return false;
//            }
//        }
//
//        return true;
    }
}
