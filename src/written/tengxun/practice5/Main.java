package written.tengxun.practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int queryNum = Integer.parseInt(br.readLine());
        while(queryNum>=1){
            try {
                String[] split = br.readLine().split(" +");
                long x = Long.parseLong(split[0]);
                int k = Integer.parseInt(split[1]);
                if(x >> k == 0){
                    System.out.println(-1);
                }else{
                    long[] longs = new long[61];
                    int depth = 0;
                    while(x != 0){
                        longs[depth] = x;
                        x = x >> 1;
                        depth++;
                    }
                    System.out.println(longs[depth - k]);
                }
            }catch (Exception r){
                System.out.println(-1);
            }

            queryNum--;
        }
    }
}