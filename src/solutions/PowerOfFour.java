package solutions;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        for(int i = 0; i <= 15; i++ ){
            double powerOfFour = Math.pow(4, i);
            if (n == powerOfFour){
                return true;
            } else if (powerOfFour > n) {
                return false;
            }
        }
        return false;
    }
}
