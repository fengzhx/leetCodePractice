package written.packageproblem.problem1;

import java.util.Arrays;

//01背包问题
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.uniquePaths(2, 62));
    }

    public int uniquePaths(int m, int n) {
        // write your code here
        int[][] uP = new int[m][n];
        Arrays.fill(uP[0],1);
        for(int i = 0;i<n;i++){
            uP[0][i] = 1;
        }
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                uP[i][j] = uP[i - 1][j] + uP[i][j - 1];
            }
        }

        return uP[m - 1][n - 1];

    }
}

