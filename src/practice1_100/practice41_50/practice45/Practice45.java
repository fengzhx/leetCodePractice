package practice1_100.practice41_50.practice45;

public class Practice45 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.jump(new int[]{2,3,1,1,4}));
    }
}

class Solution {
    public int jump(int[] nums) {
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for(int i = 0; i < nums.length - 1; i++){
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if( i == end){
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}