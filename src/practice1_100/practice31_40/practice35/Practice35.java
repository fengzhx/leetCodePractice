package practice1_100.practice31_40.practice35;

public class Practice35 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(new int[]{1, 3, 6, 6}, 5));
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        while(begin<=end){
            int mid = (begin + end) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                begin = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return begin;
    }
}