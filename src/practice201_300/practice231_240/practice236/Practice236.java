package practice201_300.practice231_240.practice236;

import java.util.LinkedList;
import java.util.List;

public class Practice236 {
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pPath = new LinkedList<>();
        List<TreeNode> qPath = new LinkedList<>();
        searchNodePath(root,p,pPath);
        searchNodePath(root,q,qPath);
        TreeNode result = null;
        while(pPath.size() != 0 && qPath.size() != 0 && pPath.get(0) == qPath.get(0)){
            result = pPath.remove(0);
            qPath.remove(0);
        }
        return result;

    }

    public boolean searchNodePath(TreeNode root, TreeNode p,List<TreeNode> current){
        current.add(root);
        if(root == p){
            return true;
        }
        if(root.left != null && searchNodePath(root.left,p,current)){
            return true;
        }
        if(root.right != null && searchNodePath(root.right,p,current)){
            return true;
        }
        current.remove(root);
        return false;

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}