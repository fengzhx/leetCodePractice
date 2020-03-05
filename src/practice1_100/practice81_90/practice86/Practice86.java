package practice1_100.practice81_90.practice86;

import generate.ListNode;

public class Practice86 {
}

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(-1);
        ListNode lessTemp = less;
        ListNode more = new ListNode(-1);
        ListNode moreTemp = more;
        if(head == null){
            return null;
        }
        while(head != null){
            if(head.val < x){
                lessTemp.next = head;
                lessTemp = lessTemp.next;
            }else {
                moreTemp.next = head;
                moreTemp = moreTemp.next;
            }
            head = head.next;
        }
        moreTemp.next = null;
        lessTemp.next = more.next;
        return less.next;
    }
}