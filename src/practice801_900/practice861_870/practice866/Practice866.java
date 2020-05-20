package practice801_900.practice861_870.practice866;

public class Practice866 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.primePalindrome(9989900));
    }
}

class Solution {
    public int primePalindrome(int N) {
        while(true){
            if(Integer.toString(N).length() % 2 == 0 && N > 11){
                N = (int) Math.pow(10,Integer.toString(N).length()) + 1;
                continue;
            }
            if(judgePrime(N) && judgePalindrome(N)){
                return N;
            }
            N++;
        }
    }

    /**
     * 判断一个数是不是素数，先验证这个数是不是1,2,3
     * 首先做判断：不在6两侧的数肯定不是质数，也就是 6i - 1 和6i + 1，因为剩下的数或者是2的倍数，或者是3的倍数
     * 如果不是，那么可以从0开始每隔6个数进行一次验证，一直验证到sqrt(num)
     */
    public boolean judgePrime(int number){
        if(number < 2){
            return false;
        }
        if(number == 2 || number == 3){
            return true;
        }
        if(number % 6 != 1 && number % 6 != 5){
            return false;
        }
        int temp = (int)Math.ceil(Math.sqrt(number));
        for(int i = 5;i<=temp;i=i+6){
            if(number % i == 0 || number % (i + 2) == 0){
                return false;
            }
        }
        return true;

    }

    public boolean judgePalindrome(int number){
        char[] chars = String.valueOf(number).toCharArray();
        int length = chars.length;
        for(int i = 0;i<chars.length/2;i++){
            if(chars[i] != chars[length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}