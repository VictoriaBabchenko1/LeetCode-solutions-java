package solutions;

import java.util.HashSet;
import java.util.Set;

public class CountNumberOfDistinctIntegersAfterReverseOperations {
    private int reverse(int num){
        int rev = 0;
        while (num != 0){
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return num;
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> distinctNums = new HashSet<>();
        for(int num : nums){
            distinctNums.add(num);
            distinctNums.add(reverse(num));
        }
        return distinctNums.size();
    }
}
