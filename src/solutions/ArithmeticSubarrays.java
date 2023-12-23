package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {
    private Boolean check(int[] subarray){
        Arrays.sort(subarray);

        int difference = subarray[1] - subarray[0];
        for(int i = 2; i < subarray.length; i++){
            if(subarray[i] - subarray[i - 1] != difference){
                return false;
            }
        }

        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();

        for(int i = 0; i < l.length; i++){
            int[] subarray = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            result.add(check(subarray));
        }

        return result;
    }
}
