package practice31_40.practice32;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class Practice32 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestValidParentheses("())"));
    }
}


class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> index = new Stack<>();
        Map<Character, Character> characterMap = new LinkedHashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        int longest = 0;
        index.push(-1);
        for (int i = 0; i < s.length(); i++) {
            index.push(i);
            char currentChar = s.charAt(i);
            if (characterMap.containsKey(currentChar)) {
                char c = stack.isEmpty() ? '*' : stack.pop();
                if (characterMap.get(currentChar) != c) {
                    stack.empty();
                    continue;
                } else {
                    index.pop();
                    index.pop();
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        int current = s.length();
        while (!index.isEmpty()) {
            int curIndex = index.pop();
            int cuDiff = current - curIndex - 1;
            longest = longest > cuDiff ? longest : cuDiff;
            current = curIndex;
        }

        return longest;
    }
}