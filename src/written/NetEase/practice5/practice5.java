package written.NetEase.practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(",");
        long[] nums = new long[s.length];
        for (int i = 0; i < s.length; i++) {
            nums[i] = Long.parseLong(s[i]);
        }
        System.out.println(getResult(nums));

    }

    public static long getResult(long[] nums){
        long temp = 0;
        long max = Long.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(temp >= 0){
                temp = temp + nums[i];
            }else{
                temp = nums[i];
            }
            if(max < temp){
                max = temp;
            }
        }
        return max;
    }
}

