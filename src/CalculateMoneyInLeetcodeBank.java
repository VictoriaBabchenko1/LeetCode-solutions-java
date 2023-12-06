public class CalculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {
        int result = 0;
        for(int j = 1; n != 0 && j <= 1000; j++){
            for(int i = j; i < j + 7 && n != 0; i++){
                result += i;
                n--;
            }
        }
        return result;
    }
}
