package practice101_200.practice151_160.practice160;

import generate.GenerateList;
import generate.ListNode;

public class Practice160 {
    public static void main(String[] args) {
        GenerateList generateList = new GenerateList("4->1->8->4->5");
        GenerateList generateList1 = new GenerateList("5->0->1->8->4->5");
        ListNode root = generateList.getRoot();
        ListNode root1 = generateList1.getRoot();
        Solution solution = new Solution();
        ListNode intersectionNode = solution.getIntersectionNode(root, root1);
        System.out.println(intersectionNode);
    }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getListLength(headA);
        int lengthB = getListLength(headB);
        if(lengthA > lengthB){
            headA = getSameLengthNode(headA,lengthA - lengthB);
        }else{
            headB = getSameLengthNode(headB,lengthB - lengthA);
        }

        while(headA != headB && headA != null){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    public int getListLength(ListNode root){
        int result = 0;
        while (root != null){
            root = root.next;
            result++;
        }
        return result;
    }

    public ListNode getSameLengthNode(ListNode root,int length){
        while(length > 0){
            root = root.next;
            length--;
        }
        return root;
    }
}