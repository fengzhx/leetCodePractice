package self.module;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
    只有一个输入N
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(result(n));
    }

    public static int result(int n){
        return 0;
    }
     */

    /**
    两个参数m,n
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] twoArgs = br.readLine().split(" +");
        int m = Integer.parseInt(twoArgs[0]);
        int n = Integer.parseInt(twoArgs[1]);
        System.out.println(result(m,n));
    }

    public static int result(int m,int n){
        return 0;
    }
     */

    /**
    n个点
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arrays = new int[n][2];
        for(int i = 0;i<n;i++){
            String[] split = br.readLine().split(" +");
            for(int j = 0;j<arrays[i].length;j++){
                arrays[i][j] = Integer.parseInt(split[j]);
            }
        }

        System.out.println(result(n,arrays));
    }

    public static int result(int n,int[][] arrays){
        return 0;
    }
     */
}
