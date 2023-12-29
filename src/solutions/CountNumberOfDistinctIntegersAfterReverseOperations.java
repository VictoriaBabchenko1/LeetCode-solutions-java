package solutions;

import java.util.HashSet;
import java.util.Set;

public class CountNumberOfDistinctIntegersAfterReverseOperations {
    int rev;
    private void reverse(int num){
        if(num == 0) return;

        rev = rev * 10 + (num % 10);
        reverse(num / 10);
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> distinctNums = new HashSet<>();
        for(int num : nums){
            distinctNums.add(num);
            rev = 0;
            reverse(num);
            distinctNums.add(rev);
        }
        return distinctNums.size();
    }
}
