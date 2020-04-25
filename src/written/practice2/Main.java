package written.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        int n = Integer.parseInt(bf.readLine());
        if(n <= 0){
            String[] chars = new String[2];
            for(int i = 0;i<2;i++){
                chars[i] = bf.readLine();
            }
            System.out.println(-1);
        }else{
            String[] chars = new String[2];
            for(int i = 0;i<2;i++){
                chars[i] = bf.readLine();
            }
            List<Integer> result = new ArrayList<>();
            recursion(chars,n,0,0,result);
            System.out.print(result.size() == 0 ? -1 : result.size());
        }
    }

    public static void recursion(String[] path,int n,int x,int y,List<Integer> result){
        if(x == 1 && y == n - 1){
            result.add(1);
            return;
        }
        if(x+1 < 2 && y+1 < n  && path[x+1].charAt(y + 1) != 'X'){
            recursion(path,n,x+1,y + 1,result);
        }
        if(x-1 >= 0 && y + 1 < n && path[x-1].charAt(y + 1) != 'X' ){
            recursion(path,n,x - 1,y + 1,result);
        }
        if(y+1 < n && path[x].charAt(y+1) != 'X'){
            recursion(path,n,x,y + 1,result);
        }
    }

}

