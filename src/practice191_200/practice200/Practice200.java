package practice191_200.practice200;

import java.util.Arrays;

public class Practice200 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "11000";
        String s2 = "11000";
        String s3 = "00100";
        String s4 = "00011";
        char[][] chars = new char[][]{s1.toCharArray(),s2.toCharArray(),s3.toCharArray(),s4.toCharArray()};
        System.out.println(solution.numIslands(chars));
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int xLength = grid.length;
        if (xLength == 0){
            return 0;
        }
        int yLength = grid[0].length;
        char[][] search = new char[xLength][yLength];
        for (int i = 0;i<grid.length;i++){
            char[] temp = new char[yLength];
            Arrays.fill(temp,'0');
            search[i] = temp;
        }
        int islandNum = 0;
        for(int i = 0;i<xLength;i++){
            for(int j = 0;j<yLength;j++){
                if(grid[i][j] == '1' && search[i][j] == '0'){
                    islandNum++;
                    DFS(grid,search,i,j);
                }

            }
        }
        return islandNum;
    }
    public void DFS(char[][] grid,char[][] search,int x,int y){
        search[x][y] = '1';
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        for(int i = 0;i<4;i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(newX < 0 || newX > grid.length - 1 || newY < 0 || newY > grid[newX].length - 1){
                continue;
            }
            if(grid[newX][newY] == '1' && search[newX][newY] == '0'){
                DFS(grid,search,newX,newY);
            }
        }

    }

}