public class SpecialPositionsInABinaryMatrix {
    public int numSpecial(int[][] mat) {
        int result = 0;

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    int count1 = 0;
                    int count2 = 0;

                    for(int k = 0; k < mat[0].length; k++){
                        if(mat[i][k] == 0){
                            count1++;
                        }
                    }

                    for(int k = 0; k < mat.length; k++){
                        if(mat[k][j] == 0){
                            count2++;
                        }
                    }

                    if(count1 == mat[0].length - 1 && count2 == mat.length - 1){
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
