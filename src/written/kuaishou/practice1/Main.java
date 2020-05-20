package written.kuaishou.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, List<String>> map = new LinkedHashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" +");
            int type = Integer.parseInt(split[0]);
            int from = Integer.parseInt(split[1]);
            int to = Integer.parseInt(split[2]);
            if(type == 1){

            }

        }
    }

    public static void getPath(int from,int to){

    }
}

class Road{
    int before;
    int next;

    public Road(int before, int next) {
        this.before = before;
        this.next = next;
    }

    int cost = 0;

    public void setCost(int cost) {
        this.cost = cost;
    }
}