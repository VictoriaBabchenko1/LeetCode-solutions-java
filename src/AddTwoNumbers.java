public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode curRes = res;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;

            curRes.next = new ListNode(sum % 10);
            curRes = curRes.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        return res.next;


//       ListNode res = new ListNode();
//        ListNode curRes = res;
//        while (l1 != null && l2 != null){
//            if(l1.val + l2.val >= 10){
//                l1.next.val += (l1.val + l2.val) / 10;
//                curRes.next = new ListNode((l1.val + l2.val) % 10);
//            }
//            else{
//                curRes.next = new ListNode(l1.val + l2.val);
//            }
//            curRes = curRes.next;
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//        return res.next;
    }
}
