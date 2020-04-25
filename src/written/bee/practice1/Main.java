package written.bee.practice1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] s = br.readLine().split(",+");
        int[] product = new int[s.length];
        for(int i = 0;i<s.length;i++){
            product[i] = Integer.parseInt(s[i]);
        }
        System.out.println(getNum(product));
    }

    public static int getNum(int[] products){
        Map<Integer, List<Integer>> map = new HashMap<>();
        Arrays.sort(products);
        for(int i = 0;i<products.length;i++){
            int num = products[i] % 3;
            if(!map.containsKey(num)){
                List<Integer> list = new LinkedList<>();
                map.put(num,list);
            }
            map.get(num).add(products[i]);
        }
        List<Integer> num1 = map.get(1);
        List<Integer> num2 = map.get(2);

        while(num1.size() != 0 && num2.size() != 0){
            Integer integer1 = num1.get(num1.size() - 1);
            Integer integer2 = num2.get(num2.size() - 1);
            map.get(0).add(integer1 + integer2);
            num1.remove(num1.size() - 1);
            num2.remove(num2.size() - 1);
        }
        if(num1.size() != 0){
            while(num1.size() >= 3){
                Integer integer1 = num1.get(num1.size() - 1);
                Integer integer2 = num1.get(num1.size() - 2);
                Integer integer3 = num1.get(num1.size() - 3);
                map.get(0).add(integer1 + integer2 + integer3);
                num1.remove(num1.size() - 1);
                num1.remove(num1.size() - 2);
                num1.remove(num1.size() - 3);
            }
        }else{
            while(num2.size() >= 3){
                Integer integer1 = num2.get(num2.size() - 1);
                Integer integer2 = num2.get(num2.size() - 2);
                Integer integer3 = num2.get(num2.size() - 3);
                map.get(0).add(integer1 + integer2 + integer3);
                num1.remove(num2.size() - 1);
                num1.remove(num2.size() - 2);
                num1.remove(num2.size() - 3);
            }
        }

        List<Integer> integerList = map.get(0);
        int result = 0;
        for(int i:integerList){
            result = result + i / 3;
        }
        return result;
    }

}
