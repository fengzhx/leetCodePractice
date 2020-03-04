package practice1_100.practice51_60.practice56;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Practice56 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int[] ints : solution.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})) {
            System.out.println(ints);
        }
    }
}


class Solution {
    public int[][] merge(int[][] intervals) {
        List<Node> nodes = new LinkedList<>();
        for (int[] ints : intervals) {
            nodes.add(new Node(ints));
        }

        Collections.sort(nodes, (o1, o2) -> {
            return Integer.compare(o1.begin, o2.begin);
        });

        LinkedList<Node> result = new LinkedList<>();
        for (Node node : nodes) {
            if (result.size() == 0 || result.getLast().end < node.begin) {
                result.add(node);
            } else {
                result.getLast().end = Math.max(result.getLast().end, node.end);
            }
        }
        int[][] great = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            great[i] = result.get(i).toArray();
        }

        return great;
    }

}

class Node {
    int begin;
    int end;

    Node(int[] interval) {
        this.begin = interval[0];
        this.end = interval[1];
    }

    public int[] toArray(){
        return new int[]{begin,end};
    }
}