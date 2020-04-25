package written.QQ.practice1;

import java.util.LinkedList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode[] children= new TreeNode[10];
    boolean judgeQQExit = false;
}

class Solution{
    public int GetTheSameQQ(final List<String> vecA, final List<String> vecB, List<String> vecRes){
        try {
            TreeNode root = new TreeNode();
            for(int i = 0;i<vecA.size();i++){
                generateTree(vecA.get(i),root);
            }
            for(int i = 0;i<vecB.size();i++){
                generateTree(vecB.get(i),root);
            }
            getQQnumber(root,vecRes,new StringBuilder());
        }catch (Exception e){
            e.printStackTrace();
            return 1;
        }
        return 0;

    }

    public void generateTree(String currentSt,TreeNode root){
        char[] chars = currentSt.toCharArray();
        for(int i = 0;i<chars.length;i++){
            int num = chars[i] - '0';
            if(root.children[num] == null){
                root.children[num] = new TreeNode();
            }
            if(i == chars.length - 1){
                root.children[num].judgeQQExit = true;
                root.children[num].val++;
            }
            root = root.children[num];
        }
    }

    public void getQQnumber(TreeNode root,List<String> vecRes,StringBuilder stringBuilder){
        for(int i = 0;i<root.children.length;i++){
            if(root.children[i] != null){
                stringBuilder.append(i);
                if(root.children[i].judgeQQExit && root.children[i].val > 1){
                    vecRes.add(stringBuilder.toString());
                }
                getQQnumber(root.children[i],vecRes,stringBuilder);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
        }
    }
}


public class Practice1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = new LinkedList<>();
        List<String> list1 = new LinkedList<>();
        List<String> result = new LinkedList<>();
        solution.GetTheSameQQ(list,list1,result);
        System.out.println(result);
    }
}