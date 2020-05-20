package written.kuaishou.practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" +");
        int x = Integer.parseInt(firstLine[0]);
        int y = Integer.parseInt(firstLine[1]);
        int[][] search = new int[x][y];
        char[][] target = new char[x][];
        for(int i = 0;i<x;i++){
            char[] chars = br.readLine().toCharArray();
            target[i] = chars;
        }
        int result = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(search[i][j] == 0 && target[i][j] == '1'){
                    if(dfs(search,target,i,j)){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }

    public static boolean dfs(int[][] search, char[][] target, int i, int j){
        if(i + 1 > target.length || i == 0 || j+1 > target[i].length || j == 0){
            return false;
        }
        if(target[i][j] != '1' || target[i][j] != '0'){
            return false;
        }
        if(target[i][j] == '0'){
            return true;
        }
        if(search[i + 1][j] == 0){

        }
        search[i][j] = 1;
        target[i][j] = '2';

        boolean judge = true;
        if(search[i + 1][j] == 0){
            judge = judge && dfs(search, target, i + 1, j);
        }
        if(search[i - 1][j] == 0){
            judge = judge && dfs(search, target, i - 1, j);
        }
        if(search[i][j + 1] == 0){
            judge = judge && dfs(search, target, i, j + 1);
        }
        if(search[i][j - 1] == 0){
            judge = judge && dfs(search, target, i, j - 1);
        }
        return judge;

    }

}
