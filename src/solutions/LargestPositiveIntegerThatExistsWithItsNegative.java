package solutions;
import java.util.HashSet;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int res = -1;
        for(int n : nums) {
            hs.add(n);
            int k = -1 * n;
            if(hs.contains(k)) {
                res = Math.max(res, Math.abs(n));
            }
        }

        return res;
    }
}
