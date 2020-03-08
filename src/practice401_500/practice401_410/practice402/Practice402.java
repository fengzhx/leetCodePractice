package practice401_500.practice401_410.practice402;

import java.util.LinkedList;

public class Practice402 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeKdigits("10200", 1));
    }
}


class Solution {
    public String removeKdigits(String num, int k) {
        LinkedList<Integer> result = new LinkedList<>();
        for(int i = 0;i<num.length();i++){
            int n = num.charAt(i) - '0';
            while(result.size() != 0 && k > 0 && result.peekLast() > n){
                result.removeLast();
                k--;
            }
            if(n != 0 || result.size() != 0){
                result.add(n);
            }
        }
        while(k>0 && result.size() > 0){
            result.removeLast();
            k--;
        }
        if(result.size() == 0){
            return "0";
        }else {
            StringBuilder s = new StringBuilder();
            for (int i : result){
                s.append(i);
            }
            return s.toString();
        }
    }
}