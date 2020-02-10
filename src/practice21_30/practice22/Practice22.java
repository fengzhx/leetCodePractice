package practice21_30.practice22;

import java.util.ArrayList;
import java.util.List;

public class Practice22 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for(String s : solution.generateParenthesis(3)){
            System.out.println(s);
        }
    }
}

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n == 0){
            res.add("");
            return res;
        }
        recursion("",n,n,res);
        return res;
    }

    public void recursion(String temp,int left,int right,List<String> res){
        if(left == 0 && right == 0){
            res.add(temp);
        }
        if(left > right){
            return;
        }
        if(left == right){
            recursion(temp + "(",left - 1,right,res);
            return;
        }
        if(left > 0){
            recursion(temp + "(",left - 1,right,res);
        }
        if(right > 0){
            recursion(temp + ")",left,right - 1,res);
        }
    }
}