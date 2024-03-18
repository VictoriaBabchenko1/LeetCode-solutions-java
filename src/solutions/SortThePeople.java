package solutions;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0; i < heights.length - 1; i++) {
            for(int j = i + 1; j < heights.length; j++) {
                if(heights[j] > heights[i]) {
                    int tempHeight = heights[j];
                    heights[j] = heights[i];
                    heights[i] = tempHeight;

                    String tempName = names[j];
                    names[j] = names[i];
                    names[i] = tempName;
                }
            }
        }

        return names;
    }
}
