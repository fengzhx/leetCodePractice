package practice301_400.practice381_390.practice384;

import java.util.Random;

public class Practice384 {
    public static void main(String[] args) {
        Solution solution = new Solution(new int[]{1,2,3});
        int[] shuffle = solution.shuffle();
        System.out.println(1);
    }
}

class Solution {
    private int[] original;
    private int[] current;
    private int length;
    private Random random = new Random();

    public Solution(int[] nums) {
        this.original = nums;
        this.length = nums.length;
        current = nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        current = original.clone();
        return current;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i = length - 1;i>=0;i--){
            int nextInt = random.nextInt(i + 1);
            swap(current,i,nextInt);
        }
        return current;
    }

    public void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}