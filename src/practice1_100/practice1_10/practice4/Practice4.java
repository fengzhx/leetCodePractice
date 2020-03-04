package practice1_100.practice1_10.practice4;

public class Practice4 {
    public static void main(String[] args) {
        int[] num1 = {1, 5};
        int[] num2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(num1, num2));
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2,nums1);
        }
        int iMin = 0, iMax = m;
        while (iMax >= iMin) {
            int i = (iMin + iMax) / 2;
            int j = (m + n + 1) / 2 - i;
            if (i != m && j != 0 && nums2[j - 1] > nums1[i] ) {
                iMin = i + 1;
            }else if (i != 0 && j != n && nums1[i - 1] > nums2[j]  ) {
                iMax = i - 1;
            } else{
                int leftMax;
                if(i == 0){
                    leftMax = nums2[j - 1];
                }else if(j == 0){
                    leftMax = nums1[i - 1];
                }else{
                    leftMax = Math.max(nums1[i - 1],nums2[j - 1]);
                }
                if((m + n) % 2 == 1){
                    return leftMax;
                }

                int rightMin;
                if(i == m){
                    rightMin = nums2[j];
                }else if(j == n){
                    rightMin = nums1[i];
                }else{
                    rightMin = Math.min(nums1[i],nums2[j]);
                }
                return (leftMax + rightMin) / 2.0;
            }
        }
        return 0.0;
    }
}