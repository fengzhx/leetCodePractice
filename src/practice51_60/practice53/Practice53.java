package practice51_60.practice53;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Practice53 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        Map<List<Integer>, Integer> map = new LinkedHashMap<>();
        int max = -100000;
        for(int i = 0;i<nums.length;i++){
            List<Integer> temp = new LinkedList<>();
            temp.add(i);
            for (List list : map.keySet()){
                
            }
        }
        return 0;
    }
}