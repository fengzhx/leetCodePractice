package practice1_100.practice41_50.practice49;

import java.util.*;

public class Practice49 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }
}

/**
 * 另一种思路就是把字母转化为数字，长度相等而且总和相等的为字母异位词
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> listMap = new LinkedHashMap<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sTemp = String.valueOf(chars);
            if(listMap.containsKey(sTemp)){
                listMap.get(sTemp).add(s);
            }else{
                listMap.put(sTemp,new LinkedList<String>(){{add(s);}});
            }
        }

        List<List<String>> result = new LinkedList<>();
        for(String s : listMap.keySet()){
            result.add(listMap.get(s));
        }
        return result;

    }
}