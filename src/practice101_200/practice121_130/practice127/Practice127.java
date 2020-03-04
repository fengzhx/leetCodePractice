package practice101_200.practice121_130.practice127;

import java.util.*;

public class Practice127 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.ladderLength("hit", "cog", new LinkedList<String>() {{
            add("hot");
            add("dot");
            add("dog");
            add("lot");
            add("log");
            add("cog");
        }}));
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        wordList.add(0,beginWord);
        Map<String,List<String>> map = new LinkedHashMap<>();
        for (int i = 0;i<wordList.size();i++){
            map.put(wordList.get(i),new LinkedList<>());
        }
        for (int i = 0;i<wordList.size();i++){
            for (int j = i + 1;j<wordList.size();j++){
                if(judgeChange(wordList.get(i),wordList.get(j))){
                    List<String> stringsI = map.get(wordList.get(i));
                    stringsI.add(wordList.get(j));
                    map.put(wordList.get(i),stringsI);

                    List<String> stringJ = map.get(wordList.get(j));
                    stringJ.add(wordList.get(i));
                    map.put(wordList.get(j),stringJ);
                }
            }
        }
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.offer(beginWord);
        Map<String,Integer> count = new LinkedHashMap<>();
        count.put(beginWord,1);
        while(!stringQueue.isEmpty()){
            String s = stringQueue.poll();
            int num = count.get(s);
            List<String> strings = map.get(s);
            for(String s1:strings){
                if (judgeChange(s1,endWord)){
                    return num+2;
                }
                if(!count.containsKey(s1)){
                    stringQueue.offer(s1);
                    count.put(s1,num+1);
                }
            }
        }
        return 0;
    }

    public boolean judgeChange(String s1,String s2){
        int change = 0;
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                change++;
            }
        }
        return change == 1;
    }
}