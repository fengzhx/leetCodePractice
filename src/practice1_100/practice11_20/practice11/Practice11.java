package practice1_100.practice11_20.practice11;

public class Practice11 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}

class Solution {
    public int maxArea(int[] height) {
        int length = height.length;
        int head = 0,tail = length - 1;
        int maxA = 0;
        while(head < tail){
            int area = 0;
            int width = tail - head;
            area = height[head] < height[tail] ? width * height[head++] : width * height[tail--];
            maxA = area > maxA ? area : maxA;

        }
        return maxA;
    }
}