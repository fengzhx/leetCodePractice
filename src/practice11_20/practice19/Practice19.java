package practice11_20.practice19;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practice19 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeNthFromEnd(new ListNode(1), 1));
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer,ListNode> map = new LinkedHashMap<>();
        int index = 1;
        ListNode listNode = head;
        map.put(index,head);
        while(listNode.next != null){
            ListNode tempListNode = listNode.next;
            index ++;
            map.put(index,tempListNode);
            listNode = tempListNode;
        }
        if(index == n){
            return map.get(1).next;
        }else if(n == 1){
            map.get(index - n).next = null;
        }else{
            map.get(index - n).next = map.get(index - n + 1).next;
        }
        return head;
    }
}