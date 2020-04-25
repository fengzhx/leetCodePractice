package written.duxiaoman.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" +");
        int n = Integer.parseInt(firstLine[0]);
        String[] secondLine = br.readLine().split(" +");
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(secondLine[i]) - 1;
        }
        int A = Integer.parseInt(firstLine[1]);
        int B = Integer.parseInt(firstLine[2]);
        int C = Integer.parseInt(firstLine[3]);
        long[] dp = new long[n];
        Arrays.fill(dp,Long.MAX_VALUE);
        getResult(input,dp,A,B,C,0,0);
        if(dp[n - 1] == Long.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(dp[n - 1]);
        }

    }

    public static void getResult(int[] input,long[] dp,int A,int B,int C,int current,long currentCost){
        int i = input[current];
        if(currentCost + A < dp[i]){
            dp[i] = currentCost + A;
            getResult(input,dp,A,B,C,i,currentCost + A);
        }
        if(i > 0 && currentCost + B + A < dp[i - 1]){
            dp[i - 1] = currentCost + B + A;
            getResult(input,dp,A,B,C,i - 1,currentCost + B + A);
        }
        if(i < input.length - 1 && currentCost + C + A < dp[i + 1]){
            dp[i + 1] = currentCost + C + A;
            getResult(input,dp,A,B,C,i + 1,currentCost + C + A);
        }

    }
}
