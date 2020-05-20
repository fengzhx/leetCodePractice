package written.tengxun.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = Integer.parseInt(br.readLine());
        while(lineCount >= 1){
            double result = Double.MAX_VALUE;
            int n = Integer.parseInt(br.readLine());
            Point[] pointA = new Point[n];
            for (int i = 0; i < n; i++) {
                String[] split = br.readLine().split(" +");
                int x = Integer.parseInt(split[0]);
                int y = Integer.parseInt(split[1]);
                Point point = new Point(x,y);
                pointA[i] = point;
            }
            Point[] pointB = new Point[n];
            for (int i = 0; i < n; i++) {
                String[] split = br.readLine().split(" +");
                int x = Integer.parseInt(split[0]);
                int y = Integer.parseInt(split[1]);
                Point point = new Point(x,y);
                pointB[i] = point;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    double v = (pointA[i].x - pointB[j].x) * (pointA[i].x - pointB[j].x) - (pointA[i].y - pointB[j].y) * (pointA[i].y - pointB[j].y);
                    if(result > v){
                        result = v;
                    }
                }
            }
            System.out.println(String.format("%.3f",Math.sqrt(result)));
            lineCount--;
        }
    }
}

class Point{
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
