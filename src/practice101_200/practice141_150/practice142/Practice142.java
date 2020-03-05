package practice101_200.practice141_150.practice142;

import generate.ListNode;

public class Practice142 {

}

class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode first = head;
        ListNode second = getIntersactionNode(head);
        if(second == null){
            return null;
        }
        while(first != second){
            first = first.next;
            second = second.next;
        }
        return first;
    }

    public ListNode getIntersactionNode(ListNode head){
        ListNode hare = head;
        ListNode tortoise = head;

        while(hare != null && hare.next != null){
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(tortoise == hare){
                return tortoise;
            }
        }
        return null;
    }
}