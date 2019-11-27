package practice1_10.practice5;


public class Practice5 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.longestPalindrome("babad"));
    }
}

class Solution {
    public String longestPalindrome(String s) {
        if ("".equals(s)) {
            return "";
        }
        String origin = s;
        String reverse = new StringBuffer(s).reverse().toString();
        int length = s.length();
        int[][] arr = new int[length][length];
        int maxLen = 0;
        int maxEnd = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (origin.charAt(i) == reverse.charAt(j)) {
                    if (i == 0 || j == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + 1;
                    }
                }
                if (arr[i][j] > maxLen) {
                    int beforeRev = length - 1 - j;
                    if (beforeRev + arr[i][j] - 1 == i) {
                        maxLen = arr[i][j];
                        maxEnd = i;
                    }
                }
            }
        }
        return s.substring(maxEnd - maxLen + 1, maxEnd + 1);
    }
}


/**
 * 暴力法（超出时间限制）
 */
class Solution1 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int maxLength = -1;
        String result = "";
        int charLength = chars.length;
        for (int i = 0; i < charLength; i++) {
            for (int j = i + 1; j < charLength + 1; j++) {
                String temp = s.substring(i, j);
                if (isPalindrom(temp)) {
                    if (temp.length() > maxLength) {
                        maxLength = temp.length();
                        result = temp;
                    }
                }
            }
        }
        return result;
    }

    public Boolean isPalindrom(String s) {
        char[] chars = s.toCharArray();
        int charLength = chars.length;
        for (int i = 0; i < charLength / 2; i++) {
            if (chars[i] != chars[charLength - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}