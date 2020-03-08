package practice101_200.practice101_110.practice105;

import java.util.Arrays;

public class Practice105 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = solution.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        System.out.println(treeNode);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = null;
        int index = 0;
        while(index <inorder.length){
            int currentNum = preorder[index];
            root = new TreeNode(currentNum);
            generateTree(root, Arrays.copyOfRange(inorder,0,index),Arrays.copyOfRange(inorder,index + 1,inorder.length),1,inorder);
            index ++;
        }
        return root;
    }

    private void generateTree(TreeNode root,int[] left,int[] right,int index,int[] preorder){
        if(index > preorder.length - 1){
            return;
        }
        int i = preorder[index];
        index ++;
        if(findIndex(left,i) == -1){
            int index1 = findIndex(right, i);
            root.right = new TreeNode(right[index1]);
            generateTree(root.right,Arrays.copyOfRange(right,0,index1),Arrays.copyOfRange(right,index1 + 1,right.length),index,preorder);
        }else {
            int index1 = findIndex(left, i);
            root.left = new TreeNode(left[index1]);
            generateTree(root.left,Arrays.copyOfRange(left,0,index1),Arrays.copyOfRange(left,index1 + 1,left.length),index,preorder);
        }

    }

    private int findIndex(int[] nums,int num){
        int begin = 0;
        int end = nums.length - 1;
        while(begin > end){
            int mid = (end + begin) / 2;
            if(nums[mid] == num){
                return mid;
            }else if(nums[mid] > num){
                end = end - 1;
            }else{
                begin = begin + 1;
            }
        }
        return -1;
    }
}