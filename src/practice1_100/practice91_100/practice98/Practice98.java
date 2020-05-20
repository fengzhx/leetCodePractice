package practice1_100.practice91_100.practice98;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Practice98 {
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
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return true;
        }
        inorderTraversal(root,list);
        int max = list.get(0);
        for(int i = 1;i<list.size();i++){
            if(max < list.get(i)){
                max = list.get(i);
            }else{
                return false;
            }
        }
        return true;
    }

    public void inorderTraversal(TreeNode root,List<Integer> list){
        if(root.left != null){
            inorderTraversal(root.left,list);
        }
        list.add(root.val);
        if(root.right != null){
            inorderTraversal(root.right,list);
        }
    }
}