class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[101];
        Arrays.fill(dp,-1);
        return Math.min(climb(0, cost, dp), climb(1, cost, dp));
    }

    public int climb(int idx, int[] cost, int[] dp) {
        int len = cost.length;
        
        if(idx>=len)
            return 0;
        
        if(idx>=len-1)
            return cost[idx];
        
        if(dp[idx]!=-1) 
            return dp[idx];

        return dp[idx] = cost[idx] +  Math.min(
             climb(idx+1, cost, dp), climb(idx+2, cost, dp));
    }
}
