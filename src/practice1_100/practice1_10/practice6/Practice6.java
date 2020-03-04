package practice1_100.practice1_10.practice6;

public class Practice6 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("PAYPALISHIRING", 4));
    }
}


class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        int blockSize = numRows + numRows - 2;
        int length = s.length();
        int blockLength = (int) Math.ceil(length / (blockSize * 1.0));
        char[][] temp = new char[blockSize][blockLength];

        for (int i = 0; i < length; i++) {
            temp[i % blockSize][i / blockSize] = s.charAt(i);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < blockLength; j++) {
                char c = temp[i][j];
                if (c != '\u0000') {
                    result.append(c);
                }
                if (i == 0 || i == numRows - 1) {
                    continue;
                }
                char ch = temp[2 * numRows - 2 - i][j];
                if (ch != '\u0000') {
                    result.append(ch);
                }

            }
        }
        return result.toString();
    }
}
