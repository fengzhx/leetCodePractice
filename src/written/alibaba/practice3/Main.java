package written.alibaba.practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] twoArgs = br.readLine().split(" ");
        int n = Integer.parseInt(twoArgs[0]);
        int m = Integer.parseInt(twoArgs[1]);
        int k = Integer.parseInt(twoArgs[2]);
        PriorityQueue<Integer> chickNum = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 < o2 ? 1 : o1.equals(o2) ? 0 : -1;
            }
        });
        String[] split = br.readLine().split(" ");
        for(int i = 0;i<n;i++){
            chickNum.offer(Integer.parseInt(split[i]));
        }
        System.out.println(result(chickNum,m,k,n));
    }

    public static Long result(PriorityQueue<Integer> chickNum,int m,int k,int n){
        long count = 0;
        int day = 0;
        while(m > day){
            day++;
            count = count + n * k;
            int poll = chickNum.poll();
            count = count - day * k / 2;
            chickNum.offer(poll / 2);
        }
        for(int num : chickNum){
            count = count + num;
        }
        return count;
    }
}
