package solutions;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        //return n > 0 && 1073741824 % n == 0; //2^30 = 1073741824
        return (Math.log10(n) / Math.log10(2)) % 1 == 0;
    }
}
