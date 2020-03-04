package practice1_100.practice31_40.practice31;

public class Practice31 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.nextPermutation(new int[]{3,2,1});
    }
}

/**
 * 最大的数肯定是倒序排列
 * 找比当前数列大的第一个数 1.从后往前看看相邻的数哪个不是倒序排列，找到第一个不是倒序排列的数的小值，记录索引
 * 2.从当前小值开始往后找大于该数的最小值 交换位置
 * 3.把索引签的值按照从小到大排列（因为本来就是降序排列，只需要交换位置就行）
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}