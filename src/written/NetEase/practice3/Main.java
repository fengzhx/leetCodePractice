package written.NetEase.practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ThreeArgs = br.readLine().split(" +");
        int n = Integer.parseInt(ThreeArgs[0]);
        int m = Integer.parseInt(ThreeArgs[1]);
        int f = Integer.parseInt(ThreeArgs[2]);
        boolean[] booleans = new boolean[n];
        booleans[f] = true;
        for (int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" +");
            int nums = Integer.parseInt(s[0]);
            for (int j = 1; j <= nums; j++) {
                if(booleans[Integer.parseInt(s[j])]){
                    for(int k = 1;k<=nums;k++){
                        booleans[Integer.parseInt(s[k])] = true;
                    }
                    break;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            if(booleans[i]){
                result++;
            }
        }
        System.out.println(result);
    }
}
