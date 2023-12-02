import java.util.HashSet;

public class OptimalPartitionOfString {
    public int partitionString(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(hs.add(s.charAt(i))){
                continue;
            }
            count++;
            hs.clear();
            hs.add(s.charAt(i));
        }

        return count + 1;
    }
}
