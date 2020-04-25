package written.jingdong.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            Map<String,Integer> map = new HashMap<>();
            for (int j = 0; j < 6 ; j++) {
                String[] s = br.readLine().split(" ");
                for(int m = 0;m<2;m++){
                    if(!map.containsKey(s[m])){
                        map.put(s[m],0);
                    }
                    map.put(s[m],map.get(s[m]) + 1);
                }
            }
            getResult(map);
        }
    }

    public static void getResult(Map<String,Integer> map){
        if(map.size() > 3){
            System.out.println("IMPOSSIBLE");
            return;
        }
        if(map.size() == 3){
            for(String s : map.keySet()){
                if(map.get(s) != 4){
                    System.out.println("IMPOSSIBLE");
                    return;
                }
            }
        }else if(map.size() == 2){
            for(String s : map.keySet()){
                if(map.get(s) != 4 || map.get(s) != 8){
                    System.out.println("IMPOSSIBLE");
                    return;
                }
            }
        }else{
            for(String s : map.keySet()){
                if(map.get(s) != 12){
                    System.out.println("IMPOSSIBLE");
                    return;
                }
            }
        }
        System.out.println("POSSIBLE");
    }
}


//2
//1345 2584
//2584 683
//2584 1345
//683 1345
//683 1345
//2584 683
//1234 4567
//1234 4567
//4567 4321
//4322 4567
//4321 1234
//4321 1234