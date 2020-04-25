package written.practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        int n = Integer.parseInt(bf.readLine());
        if(n <= 0){
            System.out.print(0 + " " + 0 + " " + 0);
        }else{
            System.out.println(0);
        }
    }
}
