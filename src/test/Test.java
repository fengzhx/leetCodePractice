package test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<TreeNode> temp = new LinkedList<>();
        temp.offer(null);
        temp.offer(null);
        System.out.println(temp);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}