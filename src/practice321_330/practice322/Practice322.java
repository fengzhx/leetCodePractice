package practice321_330.practice322;

import java.util.LinkedList;
import java.util.List;

public class Practice322 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.coinChange(new int[]{1,2,5}, 100));
    }
}


class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return 0;
        }
        int num = 0;
        List<Integer> step = new LinkedList<>();
        step.add(amount);
        boolean flag = true;
        while(flag){
            num ++;
            List<Integer> temp = new LinkedList<>();
            for(int n : step){
                for(int i = 0;i<coins.length;i++){
                    int diff = n - coins[i];
                    if(diff > 0 && !step.contains(diff)){
                        temp.add(diff);
                    }else if(diff == 0){
                        flag = false;
                    }
                }
            }
            if(temp.size() == 0 && flag){
                return -1;
            }
            step = temp;
        }
        return num;

    }
}