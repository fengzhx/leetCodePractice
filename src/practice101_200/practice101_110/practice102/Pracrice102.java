package practice101_200.practice101_110.practice102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pracrice102 {

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> treeNodes = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        treeNodes.offer(root);
        while(!treeNodes.isEmpty()){
            Queue<TreeNode> treeNodesTemp = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            while(!treeNodes.isEmpty()){
                TreeNode poll = treeNodes.poll();
                list.add(poll.val);
                if(poll.left != null){
                    treeNodesTemp.offer(poll.left);
                }
                if(poll.right != null){
                    treeNodesTemp.offer(poll.right);
                }
            }
            result.add(list);
            treeNodes = treeNodesTemp;
        }
        return result;
    }
}