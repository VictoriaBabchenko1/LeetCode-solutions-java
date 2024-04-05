package solutions;

public class MakeTheStringGreat {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int k = 0;

        while (k == 0 && !sb.isEmpty()) {
            k = 1;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (Math.abs(sb.charAt(i) - sb.charAt(i + 1)) == 32) {
                    sb.delete(i, i + 2);
                    k = 0;
                    break;
                }
            }
        }

        return sb.toString();
    }
}
