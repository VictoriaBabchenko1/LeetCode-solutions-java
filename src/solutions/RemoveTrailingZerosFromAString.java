package solutions;

public class RemoveTrailingZerosFromAString {
    public String removeTrailingZeros(String num) {
        int len = num.length();

        while (num.charAt(len - 1) == '0') {
            len--;
        }

        return num.substring(0, len);
    }
}
