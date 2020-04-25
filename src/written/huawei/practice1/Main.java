package written.huawei.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] name = br.readLine().split(",");
        for(int i = 0;i<name.length;i++){
            char[] chars = name[i].toCharArray();
            if(chars[0] < 'A' || chars[0] > 'Z'){
                System.out.println("error.0001");
                return;
            }
            for(int j = 1;j<chars.length;j++){
                if(chars[j] < 'a' || chars[j] > 'z'){
                    System.out.println("error.0001");
                    return;
                }
            }
        }
        System.out.println(getResult(name));

    }

    public static String getResult(String[] names){
        int length = names.length;
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0;i<length;i++){
            if(map.get(names[i]) == null){
                Integer integer = 0;
                map.put(names[i],integer);
            }
            map.put(names[i],map.get(names[i]) + 1) ;
        }

        String result = "";
        int maxVote = Integer.MIN_VALUE;
        for(String s : map.keySet()){
            if(map.get(s) >= maxVote){
                if(map.get(s) > maxVote){
                    result = s;
                    maxVote = map.get(s);
                }else {
                    result = result.compareTo(s) < 0 ? result : s ;
                }
            }
            if(maxVote > 100){
                return "error.0001";
            }
        }
        return result;
    }
}
