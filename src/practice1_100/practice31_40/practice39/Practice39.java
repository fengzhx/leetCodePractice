package practice1_100.practice31_40.practice39;

import java.util.LinkedList;
import java.util.List;

public class Practice39 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.combinationSum(new int[]{2,3,6,7},7);
    }
}


class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new LinkedList<>();
        for (int maxSubtrahend : candidates){
            List<Integer> temp = new LinkedList<>();
            temp.add(maxSubtrahend);
            recursion(maxSubtrahend,temp,candidates,target - maxSubtrahend,lists);
        }
        return lists;
    }

    public void recursion(int maxSubtrahend,List<Integer> tempList,int[] candidates,int diff,List<List<Integer>> result){
        if(diff == 0){
            result.add(tempList);
            return;
        }else if(diff < 0){
            return;
        }
        for(int i = 0;i<candidates.length;i++){
            if(candidates[i]<=maxSubtrahend){
                List<Integer> temp = new LinkedList<>(tempList);
                temp.add(candidates[i]);
                recursion(candidates[i],temp,candidates,diff - candidates[i],result);
            }
        }
    }
}