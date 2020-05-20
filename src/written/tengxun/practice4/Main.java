package written.tengxun.practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<String> stackA = new Stack<>();
        Stack<String> stackB = new Stack<>();
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" +");
            String command = split[0];
            if("add".equals(command)){
                stackA.push(split[1]);
            }else if("poll".equals(command)){
                if(stackB.size() == 0){
                    while(!stackA.empty()){
                        stackB.push(stackA.pop());
                    }
                }
                stackB.pop();
            }else if("peek".equals(command)){
                if(stackB.size() == 0){
                    while(!stackA.empty()){
                        stackB.push(stackA.pop());
                    }
                }
                String peek = stackB.peek();
                System.out.println(Integer.parseInt(peek));
            }
        }
    }
}
