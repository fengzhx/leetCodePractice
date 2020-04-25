package sort;

public class Sort {
    /**
     * 插入排序
     */
    public static void insertSort(int[] nums){
        if(nums.length == 0){
            return;
        }
        for(int i = 0;i<nums.length;i++){
            int currentNum = nums[i];
            for(int j = i - 1;j>=0;j--){
                if(currentNum < nums[j]){
                    nums[j+1] = nums[j];
                }else if(currentNum >= nums[j]){
                    nums[++j] = currentNum;
                    break;
                }
                if(j == 0){
                    nums[0] = currentNum;
                }
            }
        }
    }

    /**
     * 选择排序
     */
    public static void selectSort(int[] nums){
        if(nums.length == 0){
            return;
        }
        for(int i = 0;i<nums.length;i++){
            int index = i;
            for(int j = i;j<nums.length;j++){
                if(nums[index] < nums[j]){
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
    }

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
