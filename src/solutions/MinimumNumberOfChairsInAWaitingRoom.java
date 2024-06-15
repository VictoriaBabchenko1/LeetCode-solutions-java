package solutions;

public class MinimumNumberOfChairsInAWaitingRoom {
    public int minimumChairs(String s) {
        int res = 0;
        int max = 0;

        for(char ch : s.toCharArray()) {
            if(ch == 'E') {
                res++;
            }
            else{
                res--;
            }

            max = Math.max(res, max);
        }

        return max;
    }
}
