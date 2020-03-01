package test;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateTree<T> {
    private TreeNode<T> root;
    public GenerateTree(T[] tArray){
        if(tArray.length == 0){
            root = new TreeNode<>(null);
        }
        Queue<TreeNode<T>> queue = new LinkedList<>();
        TreeNode<T> first = new TreeNode<>(tArray[0]);
        TreeNode<T> swap = first;
        for(int i = 1;i<tArray.length;i++){
            TreeNode<T> curTN;
            if(tArray[i] != null){
                curTN = new TreeNode<>(tArray[i]);
            }else{
                curTN = null;
            }
            queue.offer(curTN);
            if(i % 2 == 1){
                swap.left = curTN;
            }else{
                swap.right = curTN;
                TreeNode<T> poll = queue.poll();
                if(poll == null){
                    swap = new TreeNode<>(null);
                }else{
                    swap = poll;
                }
            }
        }
        root = first;
    }
    public TreeNode getRoot(){
        return root;
    }
}
