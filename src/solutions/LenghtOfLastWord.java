package solutions;

public class LenghtOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split("\\s+");
        return arr[arr.length - 1].length();
    }
}
