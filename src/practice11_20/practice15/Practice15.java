package practice11_20.practice15;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Practice15 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSum(new int[]{0,0,0}));
    }
}


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new LinkedList<>();
        int length = nums.length;
        for(int i = 0;i<length-2;i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            if(nums[i] > 0){
                break;
            }
            int fixed = nums[i];
            int right = i + 1;
            int left = length - 1;
            while(right < left){
                int temp = fixed + nums[right] + nums[left];
                if (temp > 0 || (left < length-1 && nums[left + 1] == nums[left])) {
                    left --;
                }else if(temp < 0 || (right > i + 1 && nums[right - 1] == nums[right])){
                    right ++;
                }else{
                    List<Integer> list = new LinkedList<>();
                    list.add(fixed);
                    list.add(nums[right]);
                    list.add(nums[left]);
                    left --;
                    right ++;
                    lists.add(list);
                }
            }
        }
        return lists;
    }
}