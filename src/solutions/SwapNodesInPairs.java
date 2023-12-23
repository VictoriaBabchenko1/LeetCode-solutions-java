package solutions;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null){
            ListNode temp = new ListNode(curr.val);
            curr.val = curr.next.val;
            curr.next.val = temp.val;
            curr  = curr.next.next;
        }

        return head;
    }
}
