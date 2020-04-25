package practice201_300.practice211_220.practice213;

public class Practice213 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(new int[]{2,3,2}));
    }
}


class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int first = 0;
        int second = 0;
        int result1 = 0;
        for(int i = 0;i<nums.length - 1;i++){
            int temp = first;
            first = second;
            second = Math.max(temp + nums[i],second);
        }
        result1 = second;
        first = 0;
        second = 0;
        for(int i = 1;i<nums.length;i++){
            int temp = first;
            first = second;
            second = Math.max(temp + nums[i],second);
        }
        return Math.max(result1,second);
    }
}