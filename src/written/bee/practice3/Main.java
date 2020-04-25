package written.bee.practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] s = br.readLine().split(",");
        int[] product = new int[s.length];
        for(int i = 0;i<s.length;i++){
            product[i] = Integer.parseInt(s[i]);
        }
        List<Integer> result = getResult(product);
        for(int i = 0;i<result.size();i++){
            if(i != 0){
                System.out.print(",");
            }
            System.out.print(result.get(i));
        }
    }

    public static List<Integer> getResult(int[] times){
        List<Integer> output = new LinkedList<>();
        if(times.length == 0){
            return output;
        }
        List<Integer> temp = new LinkedList<>();
        for(int i = 0;i<times.length;i++){
            if(i % 2 == 0){
                temp.add(times[i] - 30);
            }else{
                temp.add(times[i] + 30);
            }
        }
        int before = temp.get(0);
        output.add(before);
        for(int i = 1;i<temp.size();i++){
            if(temp.get(i) - before <= 0){
                output.remove(i - 1);
                continue;
            }
            before = temp.get(i);
            output.add(temp.get(i));
        }
        before = output.get(0) + 1439;
        if(before - output.get(output.size() - 1) <= 0){
            output.remove(0);
            output.remove(output.size() - 1);
        }
//        if(output.size() == 0){
//            output.add(-30);
//            output.add(1469);
//        }
        return output;

    }
}
