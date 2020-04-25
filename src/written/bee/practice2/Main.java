package written.bee.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String s = br.readLine();
        if(s.length() == 0){
            System.out.println(0);
        }
        String[] split = s.replaceAll("[\\]\\[]", "").split(",");
        if(split.length % 2 != 0){
            System.out.println(0);
        }
        int[][] data = new int[split.length / 2][2];
        for(int i = 0;i<split.length;){
            data[i/2][0] = Integer.parseInt(split[i]);
            data[i/2][1] = Integer.parseInt(split[i+1]);
            i = i + 2;
        }
        System.out.println(getResult(data));
    }

    public static int getResult(int[][] nums){
        Arrays.sort(nums, (int[] o1, int[] o2) -> {
            return o1[0] - o2[0];
        });
        int entry = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i][0] > nums[i][1]){
                entry = nums[i][1];
                break;
            }
        }

        int result = 0;
        if(entry != Integer.MIN_VALUE){
            for(int i = 0;i<nums.length;i++){
                if(nums[i][0] >= entry){
                    result ++;
                    if(nums[i][1] == entry){
                        break;
                    }
                }
            }
        }
        return result;
    }
}
