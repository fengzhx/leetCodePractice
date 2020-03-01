package practice71_80.practice76;

public class Practice76 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minWindow("ADOBECODEBANC", "ABC"));
    }
}

class Solution {
    public String minWindow(String s, String t) {
        int arrayLength = 128;
        int[] sMap = new int[arrayLength];
        int[] tMap = new int[arrayLength];
        for(int i = 0;i<s.length();i++){
            sMap[s.charAt(i)]++;
        }
        for(int i = 0;i<t.length();i++){
            tMap[t.charAt(i)]++;
        }
        if(!judgeInWindow(sMap,tMap)){
            return "";
        }else{
            sMap = new int[arrayLength];
        }
        int begin = 0;
        String word = s;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            sMap[c]++;
            if(judgeInWindow(sMap,tMap) && t.indexOf(c) > -1){
                while(judgeInWindow(sMap,tMap)){
                    sMap[s.charAt(begin)]--;
                    begin++;

                }
                begin--;
                sMap[s.charAt(begin)]++;
                String temp = s.substring(begin,i+1);
                if(temp.length() < word.length()){
                    word = temp;
                }
            }
        }
        return word;
    }

    public boolean judgeInWindow(int[] sArray,int[] tArray){
        for(int i = 0;i<sArray.length;i++){
            if(sArray[i] < tArray[i]){
                return false;
            }
        }
        return true;
    }
}