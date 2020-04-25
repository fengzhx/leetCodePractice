package written.NetEase.practice2;

import org.jetbrains.annotations.NotNull;
import sort.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] twoArgs = br.readLine().split(" +");
        int n = Integer.parseInt(twoArgs[0]);
        int D = Integer.parseInt(twoArgs[1]);
        Monster[] monsters = new Monster[n];
        String[] split = br.readLine().split(" +");
        for (int i = 0; i < n; i++) {
            Monster monster = new Monster();
            monster.undefand = Integer.parseInt(split[i]);
            monsters[i] = monster;
        }
        String[] split1 = br.readLine().split(" +");
        for (int i = 0; i < n; i++) {
            monsters[i].hart = Integer.parseInt(split1[i]);
        }

    }

    public static long getResult(int n,int D,Monster[] monsters){
        Arrays.sort(monsters);
        for (int i = 0; i < n; i++) {
            if(monsters[i].undefand <= D){
                D++;
                monsters[i] = null;
            }
        }

        return 0;
    }

}

class Monster implements Comparable<Monster>{
    int undefand;
    int hart;

    @Override
    public int compareTo(@NotNull Monster o) {
        return undefand < o.undefand ? 1 : undefand == o.undefand ? 0 : -1;
    }
}