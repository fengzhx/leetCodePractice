package practice101_200.practice101_110.practice113;


import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Practice113 {
}

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        recursion(root,sum,result,new LinkedList<>(),0);
        return result;
    }

    public void recursion(TreeNode root,int sum,List<List<Integer>> result,List<Integer> curList,int curSum){
        if(curSum == sum && root.left == null && root.right == null){
            result.add(new LinkedList<>(curList));
            return;
        }else if(curSum > sum){
            return;
        }
        int val = root.val;
        curList.add(val);
        if(root.left != null){
            recursion(root.left,sum,result,curList,curSum + val);
        }
        if(root.right != null){
            recursion(root.right,sum,result,curList,curSum + val);
        }
        curList.remove(curList.size() - 1);
    }
}