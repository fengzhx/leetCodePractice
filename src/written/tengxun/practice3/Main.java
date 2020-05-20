package written.tengxun.practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> fore = new ArrayList<>();
        List<Integer> behind = new ArrayList<>();
        String[] splitFore = br.readLine().split(" +");
        for (int i = 0; i < n; i++) {
            fore.add(Integer.parseInt(splitFore[i]));
        }
        String[] splitBehind = br.readLine().split(" +");
        for (int i = 0; i < n; i++) {
            behind.add(Integer.parseInt(splitBehind[i]));
        }
        Map<String,Integer> map = new HashMap<>();
        List<Integer> integers = new LinkedList<>(fore);
        map.put(integers.toString(),0);
        for(int i = 0;i<n;i++){

            if(judgeResult()){

            }
        }
        System.out.println(2);
    }

    public static void dfs(){

    }

    public static boolean judgeResult(){
        return true;
    }
}
