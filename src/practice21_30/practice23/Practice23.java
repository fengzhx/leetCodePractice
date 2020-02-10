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
        int length = lists.length;
        if(length == 0){
            return null;
        }
        while(length != 1){
            for(int i = 0;i<length / 2;i++){
                if(i == length - i - 1){
                    break;
                }
                lists[i] = mergeTwoList(lists[i],lists[length - i - 1]);
            }
            length = (length + 1) / 2;
        }
        return lists[0];
    }

    public ListNode mergeTwoList(ListNode l1,ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val < l2.val){
            l1.next = mergeTwoList(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoList(l1,l2.next);
            return l2;
        }
    }
}