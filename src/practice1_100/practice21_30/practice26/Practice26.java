package practice1_100.practice21_30.practice26;

public class Practice26 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(new int[]{0,0,1,1}));
    }


}

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[slow] != nums[i]){
                slow++;
                nums[slow] = nums[i];
            }
        }
        return slow + 1;
    }
}