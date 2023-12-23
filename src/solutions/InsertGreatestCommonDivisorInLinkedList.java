package solutions;

public class InsertGreatestCommonDivisorInLinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while (curr.next != null){
            ListNode curNxt = curr.next;
            ListNode between = new ListNode(gcd(curr.val, curNxt.val));
            curr.next = between;
            between.next = curNxt;
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
