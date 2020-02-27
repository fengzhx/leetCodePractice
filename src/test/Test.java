package test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<List<Integer>> result = new LinkedHashSet<>();
        List<Integer> temp = new LinkedList<Integer>(){{add(1);add(2);}};
        result.add(temp);
        List<Integer> temp2 = new LinkedList<Integer>(){{add(1);add(2);}};
        result.add(temp2);
        System.out.println(result);

    }
}
