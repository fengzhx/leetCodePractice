package practice201_300.practice201_210.practice206;

import generate.GenerateList;
import generate.ListNode;


public class Practice206 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        GenerateList generateList = new GenerateList("1->2->3->4->5");
        ListNode root = generateList.getRoot();
        ListNode reverseList = solution.reverseList(null);
        System.out.println(reverseList);
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode result = head;
        if(head != null){
            head = head.next;
            result.next = null;
            while(head != null){
                ListNode temp = head;
                head = head.next;
                temp.next = result;
                result = temp;
            }
        }
        return result;
    }
}