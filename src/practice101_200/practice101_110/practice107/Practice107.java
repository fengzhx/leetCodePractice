package practice101_200.practice101_110.practice107;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Practice107 {
}

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        int height = 0;
        Map<Integer,List<Integer>> map = new LinkedHashMap<>();
        getValue(root,map,height);
        for (int i  = map.size() - 1;i>=0;i--){
            result.add(map.get(i));
        }
        return result;
    }

    void getValue(TreeNode root,Map<Integer,List<Integer>> map,int height){
        if (root.left != null){
            getValue(root.left,map,height+1);
        }
        if (root.right != null){
            getValue(root.right,map,height+1);
        }
        if(map.containsKey(height)){
            map.get(height).add(root.val);
        }else{
            List<Integer> temp = new LinkedList<>();
            temp.add(root.val);
            map.put(height,temp);
        }
    }
}




class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
