package practice1_100.practice71_80.practice78;

import java.util.LinkedList;
import java.util.List;

public class Practice78 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> subsets = solution.subsets(new int[]{1, 2, 3});
        System.out.println(subsets);
    }
}


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        for(int i = 0;i<nums.length;i++){
            List<Integer> temp = new LinkedList<>();
            temp.add(nums[i]);
            result.add(temp);
            recurion(temp, i+1,nums,result);
        }
        result.add(new LinkedList<>());
        return result;
    }

    public void recurion(List<Integer> list,int n,int[] nums,List<List<Integer>> result){
        for(int i = n;i<nums.length;i++){
            List<Integer> temp = new LinkedList<>(list);
            temp.add(nums[i]);
            result.add(temp);
            recurion(temp, i + 1,nums,result);
        }
    }
}