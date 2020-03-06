package practice201_300.practice231_240.practice236;

import java.util.List;

public class Practice236 {
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

    }

    public List<TreeNode> searchNodePath(TreeNode root, TreeNode p,List<TreeNode> current){
        if(root == p){
            current.add(p);
        }

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}