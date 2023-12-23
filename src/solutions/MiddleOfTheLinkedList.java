package solutions;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // fast speed 2x = slow 1x
        // when fast reaches end slow must be in the middle
        return slow;
    }
}
