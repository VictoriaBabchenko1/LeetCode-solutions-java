package solutions;

public class CountSymmetricIntegers {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low; i <= high; i++) {
            String num = Integer.toString(i);
            if(num.length() % 2 == 0) {
                int part1 = 0;
                int part2 = 0;

                for(int j = 0; j < num.length() / 2; j++) {
                    part1 += num.charAt(j) - '0';
                    part2 += num.charAt(num.length() - 1 - j) - '0';
                }

                if(part1 == part2) {
                    count++;
                }
            }
        }
        return count;
    }
}
