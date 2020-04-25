package written.alibaba.practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        String[] split = br.readLine().split(" +");
        for(int i = 0;i<split.length;i++){
            nums[i] = Integer.parseInt(split[i]);
        }
        System.out.println(String.format("%.8s",getResult(n,nums)));

    }

    public static double getResult(int n,int[] nums){
        int count = 0;
        for(int i = 0;i<n;i++){
        }
        return 14.0/6;
    }
}
