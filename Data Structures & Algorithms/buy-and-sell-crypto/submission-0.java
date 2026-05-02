class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxi = 0;

        int left = 0, right = 1;

        while(right<len){
            if(prices[left] < prices[right])
                maxi = Math.max(maxi, (prices[right] - prices[left]));
            else 
                left = right;
            ++right;
            }
        return maxi;        
    }
}
