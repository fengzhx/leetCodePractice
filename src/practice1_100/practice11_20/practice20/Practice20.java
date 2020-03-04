package practice1_100.practice11_20.practice20;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class Practice20 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("]"));
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> characterMap = new LinkedHashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(characterMap.containsKey(c)){
                Character character = stack.isEmpty() ? '&' : stack.pop();
                if(character != characterMap.get(c).charValue()){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}