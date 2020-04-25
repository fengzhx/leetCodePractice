package practice201_300.practice211_220.practice215;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Practice215 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 3));
    }
}

class Solution {
    private List<Integer> heap = new LinkedList<>();

    public int findKthLargest(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            add(k,nums[i]);
        }
        return heap.get(0);
    }

    public void add(int k, int num){
        if(heap.size() == 0){
            heap.add(num);
        }else if(heap.size() < k){
            heap.add(num);
            adjustHeap();
        }else{
            if(num > heap.get(0)){
                heap.remove(0);
                heap.add(num);
                adjustHeap();
            }
        }
    }

    public void adjustHeap(){
        for(int i = heap.size() / 2 - 1;i>=0;i--){
            adjust(i);
        }
    }

    public void adjust(int i){
        int temp = heap.get(i);
        for(int j = 2*i + 1;j<heap.size();j = 2*j + 1){
            if(j + 1 < heap.size() && heap.get(j) > heap.get(j + 1)){
                j++;
            }
            if(temp > heap.get(j)){
                heap.set(i,heap.get(j));
                i = j;
            }else{
                break;
            }
        }
        heap.set(i,temp);
    }
}
