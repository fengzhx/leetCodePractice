package practice101_200.practice191_200.practice198;

public class Practice198 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(new int[]{2,7,9,3,1}));
    }
}

class Solution {
    public int rob(int[] nums) {
        int first = 0;
        int second = 0;
        for(int i = 0;i<nums.length;i++){
            int temp = nums[i] + second;
            if(temp > first){
                second = first;
                first = temp;
            }else{
                second = first;
            }
        }
        return first;
    }
}