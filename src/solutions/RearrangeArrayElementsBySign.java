package solutions;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int[] positive = new int[nums.length / 2];
        int[] negative = new int[nums.length / 2];

        int pi = 0;
        int ni = 0;
        for(int num : nums) {
            if(num >= 0) {
                positive[pi++] = num;
            }
            else {
                negative[ni++] = num;
            }
        }

        pi = 0;
        for(int i = 0; i < nums.length; i+=2) {
            result[i] = positive[pi];
            result[i + 1] = negative[pi];
            pi++;
        }

        return result;
    }
}
