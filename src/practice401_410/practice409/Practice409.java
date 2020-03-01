package practice401_410.practice409;

public class Practice409 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("abccccdd"));
    }
}


class Solution {
    public int longestPalindrome(String s) {
        int[] map = new int[127];
        boolean add = false;
        int count = 0;
        for(int i = 0;i<s.length();i++){
            map[s.charAt(i)]++;
        }
        for (int i = 'A';i<='z';i++){
            if(map[i] % 2 == 0){
                count = count + map[i];
            }else{
                count = count + 2*(map[i] / 2);
                add = true;
            }
        }
        return add ? count + 1 : count;
    }
}