package written.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        int n = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        int[] num = new int[n];
        for(int i = 0;i<n;i++){
            num[i] = Integer.parseInt(str[i]);
        }
        for(int i : num){
            System.out.println(i);
        }

    }
}
