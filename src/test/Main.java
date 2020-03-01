package test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println(0);
        }else{
            Stack<Integer> stack = new Stack<>();
            boolean judge = false;
            int first;
            int second;
            int changeNum = 0;
            for (int i = 0;i<n;i++){
                int num = sc.nextInt();
                stack.push(num);
                if(stack.size() == 2){
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(second);
                    stack.push(first);
                    if(first == second){
                        stack.pop();
                        continue;
                    }
                    judge = first - second < 0;
                }else if(stack.size() > 2){
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(second);
                    stack.push(first);
                    if(first == second){
                        stack.pop();
                        continue;
                    }
                    if(first - second < 0 != judge){
                        changeNum++;
                        stack.clear();
                        stack.push(num);
                    }

                }
            }
            if(!stack.isEmpty()){
                changeNum ++;
            }
            System.out.println(changeNum);
        }

    }
}