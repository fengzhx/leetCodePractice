package practice1_10.practice3;

import java.util.*;

public class Practice3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
    }
}


class Solution {
    public int lengthOfLongestSubstring(String s) {
        Integer maxLength = 0;
        for(int i = 0;i<s.length();i++){
            int length = findMaxLength(i,s);
            if(length > maxLength){
                maxLength = length;
            }
        }
        return maxLength;
    }

    int findMaxLength(int index,String s){
        Set<Character> charSet = new HashSet<>();
        for (int i = index;i<s.length();i++){
            if(charSet.contains(s.charAt(i))){
                return charSet.size();
            }
            charSet.add(s.charAt(i));
        }
        return charSet.size();
    }
}

