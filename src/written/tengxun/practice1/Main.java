package written.tengxun.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int groupCount = Integer.parseInt(br.readLine());
        while(groupCount >= 1){
            Queue<Integer> queue = new LinkedList<>();
            int lineNum = Integer.parseInt(br.readLine());
            for (int i = 0; i < lineNum; i++) {
                String[] split = br.readLine().split(" +");
                String mingling = split[0];
                if(mingling.equals("PUSH")){
                    int anInt = Integer.parseInt(split[1]);
                    queue.offer(anInt);
                }else if(mingling.equals("TOP")){
                    Integer peek = queue.peek();
                    if(peek == null){
                        System.out.println(-1);
                    }else{
                        System.out.println(peek);
                    }
                }else if(mingling.equals("POP")){
                    Integer poll = queue.poll();
                    if(poll == null){
                        System.out.println(-1);
                    }
                }else if(mingling.equals("SIZE")){
                    System.out.println(queue.size());
                }else if(mingling.equals("CLEAR")){
                    queue.clear();
                }
            }
            groupCount--;
        }
    }
}

//1
//7
//PUSH 1
//PUSH 2
//TOP
//POP
//TOP
//POP
//POP
