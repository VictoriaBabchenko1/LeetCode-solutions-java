package solutions;

import java.util.Arrays;
import java.util.Comparator;

public class SortTheStudentsByTheirKthScore {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (e1, e2) -> Integer.compare(e2[k], e1[k]));
        return score;
    }
}
