package written.baidu.practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] weight = new int[n];
        String[] strings = br.readLine().split(" +");
        for(int i = 0;i<n;i++){
            weight[i] = Integer.parseInt(strings[i]);
        }
        List<Integer>[] table = new List[n];
        for(int i =0;i<n;i++){
            String[] split = br.readLine().split(" +");
            int num1 = Integer.parseInt(split[0]);
            int num2 = Integer.parseInt(split[1]);
            if(table[num1 - 1] == null){
                List<Integer> temp = new LinkedList<>();
                table[num1 - 1] = temp;
            }
            table[num1 - 1].add(num2);
        }

        List<Integer> result = new LinkedList<>();
        for(int i = 0;i<n;i++){
            dfs(weight,table,i,result,0);
        }

        int path = 0;
        for(int i = 0;i<result.size();i++){
            if(path < result.get(i)){
                path = result.get(i);
            }
        }
        System.out.println(path);
    }

    public static void dfs(int[] weight,List<Integer>[] table,int current,List<Integer> result,int pathLength){
        if(table[current] == null){
            result.add(pathLength);
            return;
        }
        for(int i = 0;i<weight.length;i++){
            if(weight[current] < weight[i]){
                dfs(weight,table,i,result,pathLength + 1);
            }else{
                result.add(pathLength);
            }
        }

    }
}
