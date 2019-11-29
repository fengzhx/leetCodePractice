package practice1_10.practice10;

public class Practice10 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isMatch("aaa", "ab*a*c*a"));
    }
}

/**
 * 把星号和前面的字符当成一个来处理
 */
class Solution {
        public boolean isMatch(String text, String pattern) {
            if (pattern.isEmpty()) {
                return text.isEmpty();
            }
            boolean first_match = (!text.isEmpty() &&
                    (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

            if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
                return (isMatch(text, pattern.substring(2)) ||
                        (first_match && isMatch(text.substring(1), pattern)));
            } else {
                return first_match && isMatch(text.substring(1), pattern.substring(1));
            }
        }

}