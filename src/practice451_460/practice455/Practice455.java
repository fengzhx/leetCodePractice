package practice451_460.practice455;

import java.util.Arrays;

public class Practice455 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
    }
}


class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g == null || s == null){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0,si = 0;
        while(gi < g.length && si < s.length){
            if(s[si] >= g[gi]){
                gi ++;
                si ++;
            }else{
                si ++;
            }
        }
        return gi;
    }
}