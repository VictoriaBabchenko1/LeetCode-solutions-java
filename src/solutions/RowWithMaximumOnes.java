package solutions;

public class RowWithMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] result = new int[2];
        int count = 0;

        for(int i = 0; i < mat.length; i++) {
            int rowCount = 0;
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1) {
                    rowCount++;
                }
            }
            if(rowCount > count) {
                result[0] = i;
                result[1] = rowCount;
                count = rowCount;
            }
        }

        return result;
    }
}
