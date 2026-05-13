class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int left = 0, right = 1;
        while(right < prices.length){
            if(prices[right] > prices[left]){
                int profit = prices[right] - prices[left];
                max = max > profit ? max : profit;
            }else{
                left = right;
            }
            right++;
        }
        return Math.max(0, max);

            
    }
}
