package self.practice16;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Main().new Solution();
        System.out.println(solution.longestPalindrome("dababcabace"));
    }

    class Solution {
        public String longestPalindrome(String s) {
            int len = s.length();
            String str = "";
            boolean[] flag = new boolean[len];
            for(int i = 0 ; i < len ; i++) {
                for(int j = 0 ; j <= i ; j++) {
                    flag[j] = (s.charAt(i) == s.charAt(j)) && (i - j < 3 || flag[j + 1]);
                    if(flag[j] && i - j + 1 > str.length()) {
                        str = s.substring(j, i + 1);
                    }
                }
            }
            return str;
        }
    }

}
