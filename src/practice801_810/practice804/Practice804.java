package practice801_810.practice804;

import java.util.HashSet;
import java.util.Set;

public class Practice804 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] strings = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(int i = 0;i<words.length;i++){
            StringBuilder s = new StringBuilder();
            for(char c : words[i].toCharArray()){
                s.append(strings[c-(int)'a']);
            }
            set.add(s.toString());
        }
        return set.size();
    }
}