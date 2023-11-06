import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class SeatManager{
//    private final TreeSet<Integer> seats;
//    int n;
//    public SeatManager(int n) {
//        seats = new TreeSet<>();
//        for(int i = 1; i <= n; i++){
//            seats.add(i);
//        }
//    }
//
//    public int reserve() {
//        int first = seats.first();
//        seats.remove(first);
//        return first;
//    }
//
//    public void unreserve(int seatNumber) {
//        seats.add(seatNumber);
//    }

    private final PriorityQueue<Integer> seats;
    int n;
    public SeatManager(int n) {
        seats = new PriorityQueue<>();
        for(int i = 1; i <= n; i++){
            seats.add(i);
        }
    }

    public int reserve() {
        int first = seats.poll();
        return first;
    }

    public void unreserve(int seatNumber) {
        seats.add(seatNumber);
    }
}
