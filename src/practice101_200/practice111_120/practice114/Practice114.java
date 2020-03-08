package practice101_200.practice111_120.practice114;

public class Practice114 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.flatten(new TreeNode(1));
    }
}

class Solution {
    public void flatten(TreeNode root) {
        if(root != null){
            recursion(root);
        }
    }

    public void recursion(TreeNode root){
        TreeNode right = root.right;
        root.right = null;
        if(root.left != null){
            recursion(root.left);
        }
        if(right != null){
            recursion(right);
        }
        root.right = root.left;
        root.left = null;
        while(root.right != null){
            root = root.right;
        }
        root.right = right;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}