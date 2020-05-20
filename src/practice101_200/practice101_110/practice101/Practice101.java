package practice101_200.practice101_110.practice101;

public class Practice101 {
    public static void main(String[] args) {

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return getSymmetric(root,root);
    }

    public boolean getSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }else if(left == null || right == null){
            return false;
        }else{
            if(left.val == right.val){
                return getSymmetric(left.left,right.right) && getSymmetric(left.right,right.left);
            }else{
                return false;
            }
        }
    }
}