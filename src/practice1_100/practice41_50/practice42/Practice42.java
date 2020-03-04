package practice1_100.practice41_50.practice42;

import java.util.Stack;

public class Practice42 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}

class Solution {
    public int trap(int[] height) {
        int length = height.length;
        if(length == 0){
            return 0;
        }
        int maxIndex = 0;
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> rightStack = new Stack<>();

        for(int i = 0;i<length;i++){
            maxIndex = height[i] > height[maxIndex] ? i : maxIndex;
        }
        int currentMax = 0;
        leftStack.push(currentMax);
        for (int i = 0;i<=maxIndex;i++){
            if(height[currentMax] < height[i]){
                leftStack.push(i);
                currentMax = i;
            }
        }

        currentMax = length - 1;
        rightStack.push(currentMax);
        for (int i = length - 1;i >= maxIndex;i--){
            if(height[currentMax] < height[i]){
                rightStack.push(i);
                currentMax = i;
            }
        }

        int leftMax = 0;
        int leftCurrent = leftStack.isEmpty() ? 0 : leftStack.pop();
        int leftMIndex = leftCurrent;
        while (!leftStack.isEmpty()){
            Integer pop = leftStack.pop();
            leftMax += height[pop] * (leftCurrent - pop);
            leftCurrent = pop;
        }

        int rightMax = 0;
        int rightCurrent = rightStack.isEmpty() ? 0 : rightStack.pop();
        int rightMIndex = rightCurrent;
        while (!rightStack.isEmpty()){
            Integer pop = rightStack.pop();
            rightMax = rightMax + height[pop] * (pop - rightCurrent);
            rightCurrent = pop;
        }

        int result = leftMax + rightMax;
        for(int i = 0;i<length;i++){
            result = result - height[i];
        }

        return result + height[maxIndex] + (rightMIndex - leftMIndex) * height[maxIndex];
    }
}