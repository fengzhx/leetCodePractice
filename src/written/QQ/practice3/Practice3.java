package written.QQ.practice3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Coord {
    int x;
    int y;
};

class Solution{
    List<Coord> GetNearestCoord(List<Coord> vec, Coord e, int k){
        List<Coord> resultArray = new LinkedList<>();
        if(vec.size() == 0){
            return resultArray;
        }
        add(vec.get(0),resultArray,k,e);
        for(int i = 1;i<vec.size();i++){
            if(getDistance(vec.get(i),e) < getDistance(resultArray.get(0),e) || resultArray.size() < k){
                add(vec.get(i),resultArray,k,e);
            }
        }
        return resultArray;
    }

    public void add(Coord coord,List<Coord> result,int k,Coord e){
        if(result.size() == 0){
            result.add(coord);
            return;
        }else if(result.size() >= k){
            result.remove(0);
        }
        result.add(coord);
        for(int i = (k-1)/2;i>=0;i--){
            int parent = i;
            Coord temp = result.get(parent);
            int lChild = i * 2 + 1;
            while(lChild < k){
                int rChild = lChild + 1;
                if(rChild < k && getDistance(result.get(lChild),e) < getDistance(result.get(rChild),e)){
                    lChild ++;
                }

                if(getDistance(temp,e) > getDistance(result.get(lChild),e)){
                    break;
                }
                result.set(parent,result.get(lChild));
                parent = lChild;
                lChild = lChild * 2;
            }
            result.set(parent,temp);
        }
    }

    public long getDistance(Coord coord,Coord center){
        return (coord.x - center.x) * 2 + (coord.y - center.y) * 2;
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Coord coord = new Coord();
        coord.x = 0;
        coord.y = 0;
        Coord coord1 = new Coord();
        coord1.x = 1;
        coord1.y = 2;
        Coord coord2 = new Coord();
        coord2.x = 2;
        coord2.y = 3;
        Coord coord3 = new Coord();
        coord3.x = 1;
        coord3.y = 3;
        List<Coord> coords = new ArrayList<>();
        coords.add(coord1);
        coords.add(coord2);
        coords.add(coord3);
        List<Coord> result = solution.GetNearestCoord(coords, coord, 2);
        for(Coord c : result){
            System.out.println(c.x + " " + c.y);
        }
    }

}