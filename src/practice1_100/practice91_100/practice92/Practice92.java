package practice1_100.practice91_100.practice92;

import generate.GenerateList;
import generate.ListNode;

public class Practice92 {
    public static void main(String[] args) {
        GenerateList generateList = new GenerateList("1->2->3->4->5");
        ListNode root = generateList.getRoot();
        Solution solution = new Solution();
        ListNode reverseBetween = solution.reverseBetween(root, 2, 2);
        System.out.println(reverseBetween);
    }
}

class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode result = new ListNode(-1);
        ListNode change = result;
        ListNode tempResult = null;
        ListNode tail = null;
        int num = 0;
        while(head != null && m <= n){
            num++;
            if(num < m){
                change.next = head;
                change = change.next;
                head = head.next;
            }else if(num <= n){
                ListNode temp = head.next;
                head.next = tempResult;
                tempResult = head;
                if(num == m){
                    tail = tempResult;
                }
                head = temp;
                if(num == n){
                    change.next = tempResult;
                    change = tail;
                }
            }else{
                change.next = head;
                change = change.next;
                head = head.next;
            }
        }
        return result.next;
    }
}