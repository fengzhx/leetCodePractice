package practice51_60.practice53;

import java.util.*;

public class Practice53 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        Map<List<Integer>, Integer> map = new LinkedHashMap<>();
        int max = nums[0];
        for(int i = 0;i<nums.length;i++){
            int numsI = nums[i];
            if(max < numsI){
                max = numsI;
            }
            Map<List<Integer>, Integer> mapTemp = new LinkedHashMap<>();
            for (List<Integer> list : map.keySet()){
                int tempMax = map.get(list) + numsI;
                if(max < tempMax){
                    max = tempMax;
                }
                List<Integer> listTemp = new LinkedList<>(list);
                listTemp.add(i);
                mapTemp.put(listTemp,tempMax);
            }
            map = mapTemp;
            List<Integer> temp = new LinkedList<>();
            temp.add(i);
            map.put(temp,numsI);
        }
        return max;
    }
}