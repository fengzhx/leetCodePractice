package practice21_30.practice21;

public class Practice21 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeTwoLists1(new ListNode(1), new ListNode(2)));
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else if(l1.val < l2.val){
            l1.next = mergeTwoLists1(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists1(l1,l2.next);
            return l2;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        while(l1 != null || l2 != null){
            if(l1 == null){
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
                continue;
            }
            if(l2 == null){
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
                continue;
            }
            int l1Val = l1.val;
            int l2Val = l2.val;
            if(l1Val > l2Val){
                temp.next = l2;
                l2 = l2.next;
            }else{
                temp.next = l1;
                l1 = l1.next;
            }
            temp = temp.next;

        }
        return listNode.next;
    }
}
