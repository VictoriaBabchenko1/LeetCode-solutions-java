public class DifferenceBeweenOnesAndZerosInRowAndColumn {
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] result = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                result[i][j] = diff(i, j, grid);
            }
        }
        return result;
    }

    private int countOnesInRow(int[][] grid, int i){
        int count = 0;
        for(int k = 0; k < grid[0].length; k++){
            if(grid[i][k] == 1){
                count++;
            }
        }
        return count;
    }

    private int countOnesInCol(int[][] grid, int j){
        int count = 0;
        for(int k = 0; k < grid.length; k++){
            if(grid[k][j] == 1){
                count++;
            }
        }
        return count;
    }

    private int diff(int i, int j, int[][] grid){
        return countOnesInRow(grid, i) + countOnesInCol(grid, j) -
                (grid[0].length - countOnesInRow(grid, i)) - (grid.length - countOnesInCol(grid, j));
    }
}
