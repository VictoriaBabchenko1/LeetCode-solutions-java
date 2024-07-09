package solutions;

public class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        double totalWaitingTime = 0;
        int currentTime = 0;

        for(int[] customer : customers) {
            int arrival = customer[0];
            int time = customer[1];
            if(currentTime < arrival) {
                currentTime = arrival;
            }
            totalWaitingTime += currentTime - arrival + time;
            currentTime += time;
        }

        return totalWaitingTime / customers.length;
    }
}
