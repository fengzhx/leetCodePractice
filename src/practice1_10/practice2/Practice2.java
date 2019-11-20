package practice1_10.practice2;

public class Practice2 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        Solution solution = new Solution();
        solution.addTwoNumbers(listNode1,listNode2);
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryFlag = 0;
        ListNode result = new ListNode(0);
        ListNode listNodeTmp  = result;
        while(l1 != null || l2 != null || carryFlag == 1){
            l1 = l1 == null ? new ListNode(0) : l1;
            l2 = l2 == null ? new ListNode(0) : l2;
            int n1 = l1.val;
            int n2 = l2.val;
            int currentNum = (n1 + n2 + carryFlag) % 10;
            carryFlag = (n1 + n2 + carryFlag) / 10;
            ListNode listNode = new ListNode(currentNum);
            listNodeTmp.next = listNode;
            listNodeTmp = listNodeTmp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}