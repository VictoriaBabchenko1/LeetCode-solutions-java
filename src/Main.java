public class Main {
    public static void LongestCommonPrefixTest(){
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));

        String[] strs2 = {"dog","racecar","car"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs2));

        String[] strs3 = {"c","acc","ccc"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs3));
    }

    public static void PowerOfFourTest(){
        int n1 = 16;
        int n2 = 5;
        int n3 = 1;

        System.out.println(new PowerOfFour().isPowerOfFour(n1));
        System.out.println(new PowerOfFour().isPowerOfFour(n2));
        System.out.println(new PowerOfFour().isPowerOfFour(n3));
    }
    public static void main(String[] args) {
        PowerOfFourTest();
    }
}