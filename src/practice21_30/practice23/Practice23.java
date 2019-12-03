package practice21_30.practice23;

public class Practice23 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeKLists(new ListNode[]{new ListNode(1), new ListNode(2), new ListNode(0)}));
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        return null;
    }
}