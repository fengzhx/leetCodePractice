package practice31_40.practice33;

public class Practice33 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{}, 3));
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int right = 0;
        int left = nums.length - 1;
        return recursion(right,left,nums,target);
    }

    public int recursion(int right,int left,int[] nums, int target){
        if (right > left){
            return -1;
        }else if(target == nums[right]){
            return right;
        }else if(target == nums[left]){
            return left;
        }else{
            int middle = (right + left) / 2;
            if(nums[middle] == target){
                return middle;
            }
            if(nums[middle] < nums[right]){
                if(nums[middle] > target || nums[right] < target){
                    return recursion(right + 1,middle - 1,nums,target);
                }else{
                    return recursion(middle + 1,left - 1,nums,target);
                }
            }else{
                if(nums[middle] > target && nums[right] < target){
                    return recursion(right + 1,middle - 1,nums,target);
                }else{
                    return recursion(middle  + 1,left - 1,nums,target);
                }
            }
        }
    }
}