package solutions;

public class SortingTheSentence {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for(String word : words) {
            int i = word.charAt(word.length() - 1) - '0';
            result[i - 1] = word.substring(0, word.length() - 1);
        }

        for(String word : result) {
            sb.append(word).append(" ");
        }

        return sb.toString().trim();
    }
}
