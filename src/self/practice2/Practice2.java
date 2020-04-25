package self.practice2;

public class Practice2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int begin = 0;
        int end = 0;
        int stringMaxLength = 0;
        while(end < s.length()){
            while(end < s.length() && judgeRepeatString(s,begin,end)){
                if(end - begin + 1 > stringMaxLength){
                    stringMaxLength = end - begin + 1;
                }
                end ++;
            }
            if(end == s.length()){
                break;
            }
            while(s.charAt(begin) != s.charAt(end)){
                begin ++;
            }
            begin ++;
        }
        return stringMaxLength;
    }

    public static boolean judgeRepeatString(String s,int begin,int end){
        int[] counts = new int[128];
        for(int i = begin;i<=end;i++){
            counts[s.charAt(i)] ++;
            if(counts[s.charAt(i)] > 1){
                return false;
            }
        }
        return true;
    }
}