package practice41_50.practice48;

public class Practice48 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.rotate(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
    }
}

class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
    }

    public void swap(int[][] matrix,int f1,int f2,int f3,int f4){
        int temp = matrix[f1][f2];
        matrix[f1][f2] = matrix[f3][f4];
        matrix[f3][f4] = temp;
    }
}