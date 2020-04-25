package written.NetEase.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] nums = new long[n];
        String[] split = br.readLine().split(" +");
        for (int i = 0; i < n; i++) {
            nums[i] = Long.parseLong(split[i]);
        }
        System.out.println(result(n,nums));
    }

    public static long result(int n,long[] nums){
        long d = 0;
        long[] numDiff = new long[n - 1];
        for (int i = 0; i < n; i++) {
            numDiff[i] = nums[i + 1] - nums[i];
            if(numDiff[i] == 0){
                return -1;
            }
        }
        d = numDiff[0];
        for(int i = 1;i< n -1;i++){
            long l = getposition1(d, numDiff[i]);
            if(l == 1){
                return 1;
            }
            d = l;

        }

        return d;
    }

    public static long getposition1(long num1,long num2){
        if(num1 > num2){
            long temp = num1;
            num1 = num2;
            num2 = temp;
        }
        while(num1 != 1){
            long temp = num2 % num1;
            if(temp == 0){
                return num1;
            }
            num2 = num1;
            num1 = temp;
        }
        return num1;
    }
}
