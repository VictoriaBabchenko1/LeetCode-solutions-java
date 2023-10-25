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

    public static void PowerOfThreeTest(){
        int n1 = 27;
        int n2 = 0;
        int n3 = -1;

        System.out.println(new PowerOfThree().isPowerOfThree(n1));
        System.out.println(new PowerOfThree().isPowerOfThree(n2));
        System.out.println(new PowerOfThree().isPowerOfThree(n3));
    }

    public static void PowerOfTwoTest(){
        int n1 = 1;
        int n2 = 16;
        int n3 = 3;

        System.out.println(new PowerOfTwo().isPowerOfTwo(n1));
        System.out.println(new PowerOfTwo().isPowerOfTwo(n2));
        System.out.println(new PowerOfTwo().isPowerOfTwo(n3));
    }

    public static void RemoveDuplicatesFromSortedListTest(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;

        ListNode current = new RemoveDuplicatesFromSortedList().deleteDuplicates(node1);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedListTest();
    }
}