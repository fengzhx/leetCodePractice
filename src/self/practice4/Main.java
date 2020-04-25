package self.practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] twoArgs = br.readLine().split(" +");
        BigDecimal float1 = new BigDecimal(twoArgs[0]);
        BigDecimal float2 = new BigDecimal(twoArgs[1]);
        System.out.println(result(float1,float2));
    }

    public static BigDecimal result(BigDecimal float2,BigDecimal float1){
        return float2.add(float1);
    }
}


