public class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode result = new ListNode();
        ListNode resultCurr = result;
        ListNode current = head.next;

        while (current != null){
            int sum = 0;
            while (current.val != 0){
                sum += current.val;
                current = current.next;
            }

            resultCurr.next = new ListNode(sum);
            resultCurr = resultCurr.next;

            current = current.next;
        }

        return result.next;
    }
}
