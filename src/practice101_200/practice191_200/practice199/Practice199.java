package practice101_200.practice191_200.practice199;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Practice199 {
    public static void main(String[] args) {
        TreeNode treeNode1= new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.right = treeNode2;
        treeNode2.right = treeNode3;
        Solution solution = new Solution();
        System.out.println(solution.rightSideView(treeNode1));
    }
}

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        if(root != null){
            queue.offer(root);
            levelTraversal(queue,list);
        }
        return list;
    }

    public void levelTraversal(Queue<TreeNode> queue,List<Integer> list){
        Queue<TreeNode> temp = new LinkedList<>();
        TreeNode treeNode = null;
        while(!queue.isEmpty()){
            TreeNode poll = queue.poll();
            treeNode = poll;
            if(poll.left != null){
                temp.offer(poll.left);
            }
            if(poll.right != null){
                temp.offer(poll.right);
            }
        }
        if(treeNode != null){
            list.add(treeNode.val);
        }
        if(temp.isEmpty()){
            return;
        }
        queue = temp;
        levelTraversal(queue,list);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}