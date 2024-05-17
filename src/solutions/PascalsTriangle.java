package solutions;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if(numRows == 0) {
            return result;
        }

        result.add(new ArrayList<>());
        result.get(0).add(1);

        for(int i = 1; i < numRows; i++) {
            List<Integer> previous = result.get(i - 1);
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);

            for(int j = 1; j < previous.size(); j++) {
                newRow.add(previous.get(j - 1) + previous.get(j));
            }

            newRow.add(1);

            result.add(newRow);
        }

        return result;
    }
}
