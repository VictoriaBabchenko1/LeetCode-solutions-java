package solutions;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        char[] result = new char[word1.length() + word2.length()];
        int index = 0;

        for(int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (i < word1.length()) {
                result[index++] = word1.charAt(i);
            }
            if (i < word2.length()) {
                result[index++] = word2.charAt(i);
            }
        }

        return new String(result);


//        StringBuilder result = new StringBuilder();
//
//        for(int i = 0; i < word1.length() || i < word2.length(); i++){
//            if(i < word1.length()){
//                result.append(word1.charAt(i));
//            }
//            if(i < word2.length()){
//                result.append(word2.charAt(i));
//            }
//        }
//
//        return result.toString();
    }
}
