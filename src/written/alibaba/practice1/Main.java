package written.alibaba.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] nums = new int[3][n];
        for(int i = 0;i<3;i++){
            String[] strings = br.readLine().split(" +");
            for(int j = 0;j<n;j++){
                nums[i][j] = Integer.parseInt(strings[j]);
            }
        }
        System.out.println(getResult(nums, n));

    }

//5 10 5 4 4
//1  7  8 4 0
//3  4  9 0 3
    public static long getResult(int[][] nums,int n){
        long[][] result = new long[3][n];

        for(int i = 1;i<n;i++){
            result[0][i] = result[0][i - 1] + Math.abs(nums[0][i] - nums[0][i - 1]);
            result[0][i] = Math.min(result[1][i - 1] + Math.abs(nums[0][i] - nums[1][i - 1]),result[0][i]);
            result[0][i] = Math.min(result[2][i - 1] + Math.abs(nums[0][i] - nums[2][i - 1]),result[0][i]);

            result[1][i] = result[1][i - 1] + Math.abs(nums[1][i] - nums[1][i - 1]);
            result[1][i] = Math.min(result[0][i - 1] + Math.abs(nums[0][i - 1] - nums[1][i]),result[1][i]);
            result[1][i] = Math.min(result[2][i - 1] + Math.abs(nums[2][i - 1] - nums[1][i]),result[1][i]);

            result[2][i] = result[2][i - 1] + Math.abs(nums[2][i] - nums[2][i - 1]);
            result[2][i] = Math.min(result[0][i - 1] + Math.abs(nums[0][i - 1] - nums[2][i]),result[2][i]);
            result[2][i] = Math.min(result[1][i - 1] + Math.abs(nums[1][i - 1] - nums[2][i]),result[2][i]);
        }

        long min = Math.min(result[0][n-1], result[1][n-1]);
        return Math.min(min,result[2][n-1]);
    }
}
