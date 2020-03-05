package practice101_200.practice131_140.practice138;

import generate.ListNode;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practice138 {
}

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new LinkedHashMap<>();
        Node result = new Node(-1);
        Node change = result;
        while(head != null){
            Node node = new Node(head.val);
            node.next = head.next;
            map.put(head,node);
            change.next = node;
            head = head.next;
            change = change.next;
        }
        for(Node node: map.keySet()){
            map.get(node).random = map.get(node.random);
        }
        return result.next;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}