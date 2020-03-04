package practice101_200.practice181_190.practice187;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Practice187 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findRepeatedDnaSequences("AAAAAAAAAAA"));
    }
}

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new LinkedList<>();
        Map<String,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<=s.length() - 10;i++){
            String s1 = s.substring(i,i + 10);
            Integer val = map.get(s1);
            if(val == null){
                map.put(s1,1);
            }else{
                map.put(s1,val+1);
            }
        }
        for(String s1 : map.keySet()){
            if(map.get(s1) > 1){
                result.add(s1);
            }
        }
        return result;
    }
}