package practice101_200.practice141_150.practice141;

import generate.ListNode;

public class Practice141 {

}

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = null;
        if(head != null){
            fast = head.next;
        }

        while(fast != head && fast != null && head != null){
            fast = fast.next;
            head = head.next;
            if(fast != null){
                fast = fast.next;
            }
        }
        if(fast == null){
            return false;
        }else{
            return true;
        }
    }
}