package practice471_480.practice473;


import sort.Sort;

public class Practice473 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.makesquare(new int[]{1,1,2,2,2}));
    }

}

class Solution {
    public boolean makesquare(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum == 0 || sum % 4 != 0){
            return false;
        }
        Sort.quickSort(nums,0,nums.length - 1);
        int sideLength = sum / 4;
        int[] bucket = new int[4];
        return recursion(bucket,nums,0,sideLength);
    }

    public boolean recursion(int[] bucket,int[] nums,int index,int sideLength){
        if(index > nums.length - 1){
            return bucket[0] == sideLength && bucket[1] == sideLength && bucket[2] == sideLength && bucket[3] == sideLength;
        }
        int current = nums[index];
        if(current > sideLength){
            return false;
        }else {
            for(int j = 0;j<4;j++){
                if(bucket[j] + current > sideLength){
                    continue;
                }
                bucket[j] += current;
                if(recursion(bucket,nums,index + 1,sideLength)){
                    return true;
                }
                bucket[j] -= current;
            }
        }
        return false;
    }


}