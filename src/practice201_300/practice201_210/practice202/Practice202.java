package practice201_300.practice201_210.practice202;

import java.util.HashSet;
import java.util.Set;

public class Practice202 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(116));
    }
}

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = nextInt(n);
        }
        return n == 1;
    }

    public static int nextInt(int n){
        int next = 0;
        while(n != 0){
            int remain = n % 10;
            n = n / 10;
            next = next + remain * remain;
        }
        return next;

    }
}