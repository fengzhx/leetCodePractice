package self.practice1;

//最长回文字符串
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("a"));
    }

}

class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String longestString = "";
        for(int i = 0;i<s.length();i++){
            if(maxLength > s.length() - i){
                break;
            }
            for(int j = i + 1;j<s.length() + 1;j++){
                if(judgeCycleString(s,i,j - 1)){
                    if(maxLength < j - i){
                        maxLength = j - i;
                        longestString = s.substring(i,j);
                    }
                }
            }
        }
        return longestString;
    }

    public static boolean judgeCycleString(String s,int begin,int end){
        if(begin >= end){
            return true;
        }
        if(s.charAt(begin) != s.charAt(end)){
            return false;
        }
        return judgeCycleString(s,++begin,--end);
    }
}