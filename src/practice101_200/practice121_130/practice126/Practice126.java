package practice101_200.practice121_130.practice126;

import java.util.*;

public class Practice126 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findLadders("sand", "c", new LinkedList<String>() {{
            add("a");
            add("b");
            add("c");
        }}));
    }
}


class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new LinkedList<>();
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
                    Set<String> set = new LinkedHashSet<>(stringsI);
                    map.put(wordList.get(i),new LinkedList<>(set));

                    List<String> stringJ = map.get(wordList.get(j));
                    stringJ.add(wordList.get(i));
                    Set<String> set1 = new LinkedHashSet<>(stringJ);
                    map.put(wordList.get(j),new LinkedList<>(set1));
                }
            }
        }

        result.add(new LinkedList<String>(){{add(beginWord);}});

        List<String> alreadySearch = new LinkedList<>();
        alreadySearch.add(beginWord);
        int length = Integer.MAX_VALUE;
        while(result.get(0).size() < length){
            List<List<String>> tempResult = new LinkedList<>();
            Set<String> currentSearch = new LinkedHashSet<>();
            for(List<String> list : result){
                String last = list.get(list.size() - 1);
                List<String> strings = map.get(last);
                for(String s1:strings){
                    LinkedList<String> temp = new LinkedList<>(list);
                    if(alreadySearch.contains(s1)){
                        continue;
                    }
                    if(s1.equals(endWord)){
                        temp.add(s1);
                        length = temp.size();
                    }else {
                        temp.add(s1);
                    }
                    tempResult.add(temp);
                    currentSearch.add(s1);
                }

            }
            if(tempResult.size() == 0){
                return new LinkedList<>();
            }
            alreadySearch.addAll(currentSearch);
            result = tempResult;
        }
        Set<List<String>> res = new LinkedHashSet<>();
        for(List<String> list : result){
            if(list.get(list.size() - 1).equals(endWord)){
                res.add(list);
            }
        }
        return new LinkedList<>(res);
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