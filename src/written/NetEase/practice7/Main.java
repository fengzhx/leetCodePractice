package written.NetEase.practice7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(",");
        long[] nums = new long[s.length];
        for (int i = 0; i < s.length; i++) {
            nums[i] = Long.parseLong(s[i]) + i;
        }
        System.out.println(getResult(nums));

    }

    public static long getResult(long[] distance){
        long maxDistance = 0;
        long maxDistance1 = 0;
        long result = 0;
        for (int i = 0; i < distance.length; i++) {
            if(maxDistance < i){
                return -1;
            }
            if(maxDistance < distance[i]){
                maxDistance = distance[i];
            }
            if(maxDistance1 <= i){
                result++;
                maxDistance1 = maxDistance;
            }
            if(maxDistance >= distance.length){
                if(maxDistance != maxDistance1){
                    result++;
                }
                return result;
            }
        }
        return result;
    }
}
