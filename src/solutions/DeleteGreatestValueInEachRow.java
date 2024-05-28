package solutions;

import java.util.Arrays;

public class DeleteGreatestValueInEachRow {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] i : grid){
            Arrays.sort(i);
        }

        int res = 0;
        for (int i = 0; i < grid[0].length; i++){
            int max = 0;
            for (int[] element : grid) {
                if (max <= element[i]) {
                    max = element[i];
                }
            }
            res = res + max;
        }

        return res;
    }
}
