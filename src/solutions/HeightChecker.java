package solutions;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        Arrays.sort(sorted);

        int result = 0;
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != sorted[i]) {
                result++;
            }
        }

        return result;
    }
}
