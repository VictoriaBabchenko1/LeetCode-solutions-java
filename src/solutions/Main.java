package solutions;

import solutions.*;

import java.util.Arrays;

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
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode current = new RemoveDuplicatesFromSortedList().deleteDuplicates(node1);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static void SingleNumberTest(){
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};
        System.out.println(new SingleNumber().singleNumber(nums1));
        System.out.println(new SingleNumber().singleNumber(nums2));
        System.out.println(new SingleNumber().singleNumber(nums3));
    }

    public static void moveZerosTest(){
        int[] nums = {0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(nums);
    }

    public  static void plusOneTest(){
        int[] nums = {4, 4, 2, 2};
        int[] nums2 = {9};
        int[] nums3 = {4, 4, 9, 9};
        int[] nums4 = {9, 9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(nums)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(nums2)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(nums3)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(nums4)));
    }

    public static void RotateImageTest(){
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        new RotateImage().rotate(matrix);
    }

    public static  void SwapNodesINPairsTest(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode current = new SwapNodesInPairs().swapPairs(node1);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        SwapNodesINPairsTest();
    }
}