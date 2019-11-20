package practice1_10.practice3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practice3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.lengthOfLongestSubstring("abcabcbb");
    }
}


class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Character> map = new LinkedHashMap<>();
        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){

            }
        }
        return 0;
    }
}