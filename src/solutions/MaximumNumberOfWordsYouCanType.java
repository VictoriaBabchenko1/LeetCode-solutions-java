package solutions;

public class MaximumNumberOfWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int result = words.length;

        for(String word : words) {
            for(char ch : word.toCharArray()) {
                if(brokenLetters.contains(""+ch)) {
                    result--;
                    break;
                }
            }
        }

        return result;
    }
}
