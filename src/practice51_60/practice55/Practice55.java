package practice51_60.practice55;


public class Practice55 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canJump(new int[]{2,3,1,1,4}));
    }
}


class Solution {
    public boolean canJump(int[] nums) {
        int maxPosition = 0;
        for(int i = 0;i<nums.length;i++){
            if(i > maxPosition){
                return false;
            }
            maxPosition = Math.max(maxPosition,nums[i] + i);
        }
        return true;
    }
}