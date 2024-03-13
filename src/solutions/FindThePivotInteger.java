package solutions;

public class FindThePivotInteger {
    public int pivotInteger(int n) {
        int totalSum = (n * (n + 1)) / 2;
        int firstSum = 0;
        for(int i = 1; i <= n; i++) {
            firstSum += i;
            int secondSum = totalSum - firstSum + i;
            if(firstSum == secondSum) {
                return i;
            }
        }
        return -1;
    }
}
