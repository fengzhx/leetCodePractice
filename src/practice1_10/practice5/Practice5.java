package practice1_10.practice5;


public class Practice5 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.longestPalindrome("babad"));
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
        for(int i = 0;i<charLength;i++){
            for(int j = i + 1;j<charLength + 1;j++){
                String temp = s.substring(i,j);
                if(isPalindrom(temp)){
                    if(temp.length() > maxLength){
                        maxLength = temp.length();
                        result = temp;
                    }
                }
            }
        }
        return result;
    }

    public Boolean isPalindrom(String s){
        char[] chars = s.toCharArray();
        int charLength = chars.length;
        for (int i = 0;i<charLength/2;i++){
            if(chars[i] != chars[charLength - 1 - i]){
                return false;
            }
        }
        return true;
    }
}