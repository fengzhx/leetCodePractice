package self.practice15;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i] > maxPrice){
                maxPrice = prices[i];
            }
            if(prices[i] < minPrice){
                if(result < maxPrice - minPrice){
                    result = maxPrice - minPrice;
                }
                minPrice = prices[i];
                maxPrice = 0;
            }
        }
        return result < maxPrice - minPrice ? maxPrice - minPrice : result;

    }
}