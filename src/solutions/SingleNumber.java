package solutions;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        //1. XOR operation with 0 gives the same number: a XOR 0 = a
        //2. XOR operation with same number gives 0: a XOR a = 0
        //3. XOR is associative (like sum): b XOR a = a XOR b
        int result=0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
