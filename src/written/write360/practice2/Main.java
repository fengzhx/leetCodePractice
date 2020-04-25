package written.write360.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String[] split = bf.readLine().split(" +");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        List<Double> each = new ArrayList<>();
        double result = 0;
        getResult(n,m,each,1);
        for(double d : each){
            result = result + d;
        }
        System.out.println(String.format("%.4f",result));

    }

    public static void getResult(int n,int m,List<Double> each,double before){
        if(m <= 0 && n >0){
            each.add(before);
            return;
        }
        if(n<=0){
            return;
        }
        int tempN = n;
        int tempM = m;
        double noGet = tempM *1.0 / (tempN + tempM) * before;
        tempM--;
        if(tempM == 0){
            each.add(n * 1.0/(n+m) * before);
            return;
        }else{
            noGet = tempM *1.0 / (tempN + tempM) * noGet;
            tempM --;
            getResult(tempN,tempM - 1,each,noGet * (tempM *1.0 / (tempN + tempM)));
            getResult(tempN - 1,tempM,each,noGet * (tempN *1.0 / (tempN + tempM)));
        }
        each.add(n * 1.0/(n+m) * before);
    }
}
