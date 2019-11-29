package practice1_10.practice9;

public class Practice9 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrom2(10));
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        try{
            int i = Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
            return i == x;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public boolean isPalindrom2(int x){
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int reverseNum = 0;
        while(x > reverseNum){
            int a = x % 10;
            x = x / 10;
            reverseNum = reverseNum * 10 + a;
        }

        return x == reverseNum || x == reverseNum / 10;
    }
}
