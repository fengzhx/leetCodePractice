package test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        boolean b = test.judgeChange("hit", "hot");
        System.out.println(b);
}

    public boolean judgeChange(String s1,String s2){
        int change = 0;
        for(int i = 0;i<s1.length();i++){
            System.out.println();
            if(s1.indexOf(i) != s2.indexOf(i)){
                change++;
            }
        }
        return change == 1;
    }
}
