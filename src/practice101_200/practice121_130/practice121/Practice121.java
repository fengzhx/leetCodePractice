package practice101_200.practice121_130.practice121;

public class Practice121 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfile = 0;
        for (int i : prices){
            if(i < minPrice){
                minPrice = i;
            }else if(i - minPrice > maxProfile){
                maxProfile = i - minPrice;
            }
        }
        return maxProfile;
    }
}