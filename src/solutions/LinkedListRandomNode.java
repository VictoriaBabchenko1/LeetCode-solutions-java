package solutions;

import java.util.ArrayList;
import java.util.List;

public class LinkedListRandomNode {
    private List<Integer> list = new ArrayList<>();
    public LinkedListRandomNode(ListNode head) {
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
    }

    public int getRandom() {
        return list.get((int)(Math.random() * list.size()));
    }
}
