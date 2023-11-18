import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class InsertGreatestCommonDivisorInLinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while (curr.next != null){
            ListNode curNxt = curr.next;
            ListNode beatween = new ListNode(gcd(curr.val, curNxt.val));
            curr.next = beatween;
            beatween.next = curNxt;
            curr = curNxt;
        }

        return head;
    }

    private int gcd(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }
}
