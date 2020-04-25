package practice1_100.practice11_20.practice16;

import java.util.Arrays;

public class Practice16 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,-1,-1,3};
        System.out.println(threeSumClosest(nums, -1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int numLength = nums.length;
        // 如果需要对最值进行运算，那么就不要用最大值，最小值，可能会越界
        int result = nums[0] + nums[1] + nums[2];
        boolean flag = false;
        for (int i = 0; i < numLength; i++) {
            int begin = i + 1;
            int end = numLength - 1;
            while(begin < end){
                int temp = nums[i] + nums[begin] + nums[end];
                if(Math.abs(temp - target) < Math.abs(result - target)){
                    result = temp;
                }
                if(temp - target > 0){
                    end--;
                }
                if(temp - target < 0){
                    begin++;
                }
                if(temp - target == 0){
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return result;
    }

}

