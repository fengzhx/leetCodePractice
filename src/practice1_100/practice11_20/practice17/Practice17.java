package practice1_100.practice11_20.practice17;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Practice17 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
    }
}

class Solution {
    public List<String> letterCombinations(String digits) {
        Map<String, String> map = new LinkedHashMap<String, String>() {{
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }};
        int dLength = digits.length();
        List<String> list = new LinkedList<>();
        for(int i = 0;i<dLength;i++){
            List<String> temp = new LinkedList<>();
            String tempS = map.get(digits.substring(i,i+1));
            for (int j = 0;j<tempS.length();j++){
                if(i == 0){
                    temp.add(tempS.substring(j,j+1));
                }else{
                    for(String s : list){
                        temp.add(s + tempS.substring(j,j+1));
                    }
                }
            }
            list = temp;
        }
        return list;
    }
}