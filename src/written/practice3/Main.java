package written.practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String readLine = bf.readLine();
        String[] s = readLine.split(" ");
        int n = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);
        String readLine2 = bf.readLine();
        String[] strings = readLine2.split(" ");
        int[] nums = new int[n];
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        int[] count = new int[1001];
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(count[nums[i]] > maxNum){
                maxNum = count[nums[i]];
            }
        }
        for(int i = 0;i<=1000;i++){
            int newNumber = i | x;
            if(newNumber > 1000){
                break;
            }
            if(count[i] + count[newNumber] > maxNum){
                maxNum = count[i] + count[newNumber];
            }
        }
        System.out.println(maxNum);
    }
}

