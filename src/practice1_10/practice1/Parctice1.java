package practice1_10.practice1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Parctice1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution();
        int[] ints = solution.twoSum(nums, target);
        for(int n :ints){
            System.out.println(n);
        }
    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashMap = new LinkedHashMap<>();
        Integer index = 0;
        for(Integer n : nums){
            if(hashMap.containsKey(target - n)){
                return new int[]{hashMap.get(target - n),index};
            }
            hashMap.put(n,index);
            index ++;
        }
        throw new IllegalArgumentException("no answer");
    }
}