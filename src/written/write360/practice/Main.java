package written.write360.practice;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String s1 = bf.readLine();
        String s2 = bf.readLine();
        System.out.println(getResult(s1, s2));

    }
    public static int getResult(String s1,String s2){
        int result = 0;
        int numA = 0;
        int numB = 0;
        for(int i = 0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1 != c2){
                if(c1 == 'A'){
                    numA++;
                }else{
                    numB++;
                }
            }
        }
        while(numA != 0 && numB != 0){
            result++;
            numA--;
            numB--;
        }
        return result + numA + numB;
    }
}
