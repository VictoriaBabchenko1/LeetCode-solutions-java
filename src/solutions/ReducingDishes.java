package solutions;

import java.util.Arrays;

public class ReducingDishes {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int total = 0;
        int num = 1;
        int result = 0;

        for(int i = 0; i < satisfaction.length; i++){
            total += satisfaction[i] * num;
            if(total > result){
                result = total;
                num++;
            }
        }

        return result;
    }
}
