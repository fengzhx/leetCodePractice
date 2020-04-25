package written.jingdong.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<People> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            People people = new People();
            people.begin = Integer.parseInt(s[0]);
            people.end = Integer.parseInt(s[1]);
            list.add(people);
        }
        list.sort(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.begin < o2.begin ? -1 : o1.begin == o2.begin ? o1.end > o2.end ? 1 : 0 : 1;
            }
        });
        getResult(list);
    }

    public static void getResult(List<People> list){
        int maxSet = 0;
        List<People> ready = new LinkedList<>();
        ready.add(list.get(0));
        for(int i = 1;i<list.size();i++){
            if(maxSet < ready.size()){
                maxSet = ready.size();
            }
            List<People> tempList = new LinkedList<>();
            People temp = list.get(i);
            for(People people : ready){
                if(temp.begin <= people.end){
                   tempList.add(people);
                }
            }
            ready = tempList;
            ready.add(temp);
        }
        System.out.println(maxSet);

    }
}

class People{
    int begin;
    int end;
}
