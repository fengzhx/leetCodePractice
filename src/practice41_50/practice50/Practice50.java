package practice41_50.practice50;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Practice50 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solveNQueens(8));
    }
}

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new LinkedList<>();
        char[][] chars = new char[n][n];
        recursion(0,chars,res,n);
        return res;
    }

    public void recursion(int floor,char[][] chars,List<List<String>> res,int n){
        if(floor >= n){
            List<String> temp = new LinkedList<>();
            for (int i = 0;i<n;i++){
                StringBuilder s = new StringBuilder();
                for(int j = 0;j<n;j++){
                    s.append(chars[i][j]);
                }
                temp.add(s.toString());
            }
            res.add(temp);
            return;
        }

        for (int i = 0;i<n;i++){
            if(chars[floor][i] != '.'){
                char[][] recur = new char[n][n];
                for(int j = 0;j<n;j++){
                    for(int m = 0;m<n;m++){
                        recur[j][m] = chars[j][m];
                    }
                }
                Arrays.fill(recur[floor],'.');
                for (int j = floor;j<n;j++){
                    recur[j][i] = '.';
                }
                for (int j = floor + 1,m = i + 1;j<n && m<n;j++,m++){
                    recur[j][m] = '.';
                }
                for (int j = floor + 1,m = i - 1;j<n && m>=0;j++,m--){
                    recur[j][m] = '.';
                }
                recur[floor][i] = 'Q';
                recursion(floor + 1,recur,res,n);
            }
        }

    }
}