package written.alibaba.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        if(s1.length() != s2.length()){
            System.out.println(-1);
        }
        int pisition = 0;
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i) == s2.charAt(pisition)){
                pisition ++;
            }
        }
        System.out.println(s2.length() - pisition);

    }
}