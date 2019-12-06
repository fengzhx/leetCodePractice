package practice41_50.practice46;

import java.util.LinkedList;
import java.util.List;

public class Practice46 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.permute(new int[]{1,2,3});
    }
}


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        for (int i : nums){
            List<Integer> list = new LinkedList<>();
            list.add(i);
            recursion(nums,list,result);
        }

        return result;
    }

    public void recursion(int[] nums,List<Integer> list,List<List<Integer>> result){
        if(list.size() == nums.length){
            result.add(list);
            return;
        }
        for (int i : nums){
            List<Integer> listTemp = new LinkedList<>(list);
            if(!listTemp.contains(i)){
                listTemp.add(i);
                recursion(nums,listTemp,result);
            }


        }
    }
}