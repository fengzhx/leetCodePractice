package practice111_120.practice114;

public class Practice114 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.flatten(new TreeNode(1));
    }
}

class Solution {
    public void flatten(TreeNode root) {
        if(root != null){
            TreeNode right = root.right;
            root.right = null;

        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}