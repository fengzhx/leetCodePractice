package practice1_100.practice61_70.practice61;

public class Practice61 {
    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ListNode begin = head;
        int listLength = 1;
        while(head.next != null){
            listLength++;
            head = head.next;
        }
        head.next = begin;
        int move = listLength - k % listLength;
        while(move > 1){
            begin = begin.next;
            move--;
        }
        ListNode result = begin.next;
        begin.next = null;
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}