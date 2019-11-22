package practice1_10.practice4;

public class Practice4 {
    public static void main(String[] args) {
        int[] num1 = {1,5};
        int[] num2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(num1, num2));
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        if(length1 < length2){
            int[] numTem = nums1;nums1 = nums2;nums2 = numTem;
            int length = length1;length1 = length2;length2 = length;
        }
        if(length2 == 0){
            length1 --;
            return (nums1[(int)Math.ceil(length1/2.0)] + nums1[(int)Math.floor(length1/2.0)]) / 2.0;
        }
        int num1Index = length1 - 1;
        int num2Index = 0;
        while (nums1[num1Index] <= nums2[num2Index]){
            num2Index = num2Index / 2;
            num1Index = length1 + length2 - 1;
            if(num2Index == 0){

            }
        }
        return nums1[0];
    }
}