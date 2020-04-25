package written.baidu.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return  o1 > o2 ? -1 : o1.equals(o2) ? 0 : 1;
            }
        });
        String[] strings = br.readLine().split(" +");
        for(int i = 0;i<n;i++){
            pq.offer(Long.parseLong(strings[i]));
        }
        System.out.println(getResult(pq,n));

    }


    public static long getResult(PriorityQueue<Long> pq,int n){
        long count = 0;
        int temp = n;
        if(pq.size() == 0){
            return count;
        }
        Long poll = pq.poll();
        while(poll != null && poll >= n){
            poll = poll - temp;
            n--;
            pq.offer(poll);
            poll = pq.poll();
            count++;
        }

        return count;
    }
}
