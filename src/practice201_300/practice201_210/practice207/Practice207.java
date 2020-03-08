package practice201_300.practice201_210.practice207;

import java.util.*;

public class Practice207 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canFinish(2, new int[][]{{1, 0},{0,1}}));
    }
}

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Set<Integer>[] map = new LinkedHashSet[numCourses];
        for(int i = 0;i<prerequisites.length;i++){
            if(map[prerequisites[i][0]] == null){
                Set<Integer> set = new LinkedHashSet<>();
                map[prerequisites[i][0]] = set;
            }
            map[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        for(int i = 0;i<numCourses;i++){
            if(map[i] == null){
                continue;
            }
            boolean[] alreadySearch = new boolean[numCourses];
            LinkedList<Integer> temp = new LinkedList<>(map[i]);
            while(!temp.isEmpty()){
                int integer = temp.removeFirst();
                if(alreadySearch[integer]){
                    continue;
                }
                alreadySearch[integer] = true;
                if(map[integer] == null){
                    continue;
                }
                if(i == integer){
                    return false;
                }
                temp.addAll(map[integer]);
            }
        }
        return true;
    }
}