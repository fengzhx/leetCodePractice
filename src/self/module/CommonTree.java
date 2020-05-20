package self.module;

import generate.Node;

public class CommonTree {
    /**
     *                        1
     *              2                   3
     *          4         5        6          7
     *        8   9                             10
     *              11
     */

    public static Node getRoot(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = node8;
        node4.right = node9;
        node9.right = node11;
        node7.left = node10;
        return node1;
    }
}