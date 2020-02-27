package practice81_90.practice90;

import java.util.*;

public class Practice90 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subsetsWithDup(new int[]{1, 2, 2}));
    }
}
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new LinkedHashSet<>();
        for(int i = 0;i<nums.length;i++){
            List<Integer> temp = new LinkedList<>();
            temp.add(nums[i]);
            result.add(temp);
            recurion(temp, i+1,nums,result);
        }
        result.add(new LinkedList<>());
        return new LinkedList<>(result);
    }

    public void recurion(List<Integer> list,int n,int[] nums,Set<List<Integer>> result){
        for(int i = n;i<nums.length;i++){
            List<Integer> temp = new LinkedList<>(list);
            temp.add(nums[i]);
            result.add(temp);
            recurion(temp, i + 1,nums,result);
        }
    }
}