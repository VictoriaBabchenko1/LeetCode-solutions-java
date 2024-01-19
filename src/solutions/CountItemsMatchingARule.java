package solutions;

import java.util.List;

public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index;

        if("type".equals(ruleKey)) {
            index = 0;
        }
        else if("color".equals(ruleKey)) {
            index = 1;
        }
        else {
            index = 2;
        }

        for(List<String> item : items) {
            if(item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
