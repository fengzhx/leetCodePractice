package practice1_100.practice91_100.practice96;

public class Practice96 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numTrees(4));
    }
}

class Solution {
    public int numTrees(int n) {
        if(n == 1){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i<n + 1;i++){
            int count = 0;
            for(int j = 0;j<i;j++){
                count = count + dp[j] * dp[i - 1 - j];
            }
            dp[i] = count;
        }
        return dp[n];
    }
}