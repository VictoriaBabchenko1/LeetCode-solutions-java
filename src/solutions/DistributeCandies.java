package solutions;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();

        for (int j : candyType) {
            set.add(j);
        }

        return Math.min(set.size(), candyType.length / 2);
    }
}
