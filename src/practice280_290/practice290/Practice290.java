package practice280_290.practice290;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practice290 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.wordPattern("abba", "dog cat cat dog"));
    }
}


class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if(pattern.length() != strings.length){
            return false;
        }
        Map<String,Character> map = new LinkedHashMap<>();
        int[] patternMap = new int[128];
        for(int i = 0;i<strings.length;i++){
            if(map.get(strings[i]) == null){
                if(patternMap[pattern.charAt(i)] != 0){
                    return false;
                }
                patternMap[pattern.charAt(i)]++;
                map.put(strings[i],pattern.charAt(i));
            }else{
                if(map.get(strings[i]) != pattern.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}