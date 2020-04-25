import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        getResult(head,n);
        return head;
    }

    public static void getResult(ListNode root,int n){
        Stack<ListNode> stack = new Stack<>();
        while(root != null){
            stack.push(root);
            root = root.next;
        }
        for (int i = 0; i < n - 2; i++) {
            stack.pop();
        }
        ListNode before = stack.pop();
        stack.pop();
        ListNode pop = stack.pop();
        pop.next = before;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}