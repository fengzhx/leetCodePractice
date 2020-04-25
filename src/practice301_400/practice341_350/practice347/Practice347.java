package practice301_400.practice341_350.practice347;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Practice347 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.topKFrequent(new int[]{5,2,5,3,5,3,1,1,3}, 2)));
    }
}


class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    List<Integer> heap = new LinkedList<>();
    int k;

    public int[] topKFrequent(int[] nums, int k) {
        this.k = k;
        for(int i = 0;i<nums.length;i++){
            heapAdd(nums[i]);
        }
        return heap.stream().mapToInt(Integer::valueOf).toArray();
    }

    public void heapAdd(int num){
        boolean flag = false;
        if(!map.containsKey(num)){
            flag = true;
            map.put(num,0);
        }
        map.put(num,map.get(num)+1);
        if(heap.size() == 0){
            heap.add(num);
        }else if(flag && heap.size()<k){
            heap.add(num);
            heapAdjust();
        }else{
            if(heap.contains(num)){
                heapAdjust();
            }else if(map.get(heap.get(0)) < map.get(num) && !heap.contains(num)){
                heap.remove(0);
                heap.add(num);
                heapAdjust();
            }
        }
    }

    public void heapAdjust(){
        for(int i = heap.size() / 2 - 1;i>=0;i--){
            adjust(i);
        }
    }

    public void adjust(int current){
        int integer = heap.get(current);
        for(int i = 2*current+1;i<heap.size();i=2*i+1){
            if(i + 1< heap.size() && map.get(heap.get(i)) > map.get(heap.get(i+1))){
                i++;
            }
            if(map.get(integer) > map.get(heap.get(i))){
                heap.set(current,heap.get(i));
                current = i;
            }else{
                break;
            }
        }
        heap.set(current,integer);
    }
}
