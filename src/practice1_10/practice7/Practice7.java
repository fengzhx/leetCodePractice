package practice1_10.practice7;

public class Practice7 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-1232356789));
    }
}

class Solution {
    public int reverse(int x) {
        String s = x >= 0 ? new StringBuilder(String.valueOf(x)).reverse().toString() : "-" + new StringBuilder(String.valueOf(x).substring(1)).reverse().toString();
        try{
            return Integer.valueOf(s);
        }catch (NumberFormatException e){
            return 0;
        }
    }
}