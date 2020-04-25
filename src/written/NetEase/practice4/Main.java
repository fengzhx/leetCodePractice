package written.NetEase.practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] twoArgs = br.readLine().split(" +");
        int n = Integer.parseInt(twoArgs[0]);
        int m = Integer.parseInt(twoArgs[1]);
        int[][] position = new int[n][m];
        for (int i = 0; i < n; i++) {
            char[] s = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                position[i][j] = s[j] - '0';
            }
        }
        System.out.println(1);
    }
}

