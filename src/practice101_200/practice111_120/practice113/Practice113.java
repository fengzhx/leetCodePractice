package practice101_200.practice111_120.practice113;

import java.util.LinkedList;
import java.util.List;

public class Practice113 {
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        if(root != null){
            recursion(root,sum,result,new LinkedList<>(),0);
        }
        return result;
    }

    public void recursion(TreeNode root,int sum,List<List<Integer>> result,List<Integer> curList,int curSum){
        int val = root.val;
        curSum = curSum + val;
        curList.add(val);
        if(root.left != null){
            recursion(root.left,sum,result,curList,curSum);
        }
        if(root.right != null){
            recursion(root.right,sum,result,curList,curSum);
        }
        if(curSum == sum && root.left == null && root.right == null){
            result.add(new LinkedList<>(curList));
        }
        curList.remove(curList.size() - 1);
    }
}