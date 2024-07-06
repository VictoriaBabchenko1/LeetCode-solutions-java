package solutions;

public class PassThePillow {
    public int passThePillow(int n, int time) {
        int currentPosition = 1;
        boolean movingForward = true;
        for(int i = 1; i <= time; i++) {
            if(movingForward) {
                currentPosition++;
                if(currentPosition == n) {
                    movingForward = false;
                }
            }
            else {
                currentPosition--;
                if(currentPosition == 1) {
                    movingForward= true;
                }
            }
        }

        return currentPosition;
    }
}
