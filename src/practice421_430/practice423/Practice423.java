package practice421_430.practice423;

public class Practice423 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.originalDigits("owoztneoer"));
    }
}

class Solution {
    public String originalDigits(String s) {
        int[] count = new int[26 + (int)'a'];
        for(char c: s.toCharArray()){
            count[c]++;
        }
        int[] numberCount = new int[10];
        numberCount[0] = count['z'];
        numberCount[2] = count['w'];
        numberCount[4] = count['u'];
        numberCount[6] = count['x'];
        numberCount[8] = count['g'];
        numberCount[3] = count['r'] - numberCount[0] - numberCount[4];
        numberCount[5] = count['f'] - numberCount[4];
        numberCount[7] = count['s'] - numberCount[6];
        numberCount[1] = count['o'] - numberCount[0] - numberCount[2] - numberCount[4];
        numberCount[9] = count['i'] - numberCount[5] - numberCount[6] - numberCount[8];

        String[] strings = new String[]{"0","1","2","3","4","5","6","7","8","9"};
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<10;i++){
            for(int j = 0;j<numberCount[i];j++){
                stringBuilder.append(strings[i]);
            }
        }
        return stringBuilder.toString();
    }
}