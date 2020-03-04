package sort;

public class Sort {
    public static void quickSort(int[] nums,int begin,int end){
        if(begin >= end){
            return;
        }
        int tail = end;
        int standard = nums[begin];
        while(begin < end){
            while(nums[end] <= standard && end > begin){
                end --;
            }
            if(nums[end] > standard){
                nums[begin] = nums[end];
                begin ++;
            }
            while(nums[begin] >= standard && begin < end){
                begin ++;
            }
            if(nums[begin] < standard){
                nums[end] = nums[begin];
                end --;
            }
        }
        nums[begin] = standard;
        quickSort(nums,0,begin - 1);
        quickSort(nums,begin + 1,tail);
    }
}
