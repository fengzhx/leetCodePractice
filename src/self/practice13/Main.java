package self.practice13;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        getResult(matrix);
        System.out.println();
    }

    public static void getResult(int[][] matrix){
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
