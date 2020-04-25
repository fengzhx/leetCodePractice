package self.practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] twoArgs = br.readLine().split(" +");
        int m = Integer.parseInt(twoArgs[0]);
        int n = Integer.parseInt(twoArgs[1]);
        int[] weight = new int[m];
        for(int i = 0;i<m;i++){
            weight[i] = Integer.parseInt(br.readLine());
        }
        List<Integer>[] adjacent = new ArrayList[m];
        for(int i = 0;i<n;i++){
            String[] split = br.readLine().split(" +");
            int anInt = Integer.parseInt(split[0]);
            if(adjacent[anInt - 1] == null){
                List<Integer> temp = new ArrayList<>();
                adjacent[anInt - 1] = temp;
            }
            adjacent[anInt - 1].add(Integer.parseInt(split[1]) - 1);
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> alreadSearch = new ArrayList<>();
        for(int i = 0;i<m;i++){
            Integer num = i;
            alreadSearch.add(num);
            result(result,num,alreadSearch,weight,adjacent);
            alreadSearch.remove(num);
        }
        int max = Integer.MIN_VALUE;
        int index = Integer.MIN_VALUE;
        for(int i = 0;i<result.size();i++){
            if(result.get(i).size() > max){
                index = i;
                max = result.get(i).size();
            }
        }
        System.out.println(result.get(index));

    }

    public static void result(List<List<Integer>> result,int current,List<Integer> alreadSearch,int[] weight,List<Integer>[] adjacent){
        if(adjacent[current] == null){
            result.add(new ArrayList<>(alreadSearch));
            return;
        }
        List<Integer> list = adjacent[current];
        for(int i = 0;i<list.size();i++){
            Integer num = list.get(i);
            alreadSearch.add(num);
            result(result,num,alreadSearch,weight,adjacent);
            alreadSearch.remove(num);
        }
    }
}
