class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for(int i = 2;i<cost.length;i++){
            dp[i] = cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        
        dp[dp.length-1] = Math.min(dp[dp.length-3],dp[dp.length-2]);
        
        for (int element: dp) {
            System.out.println(element);
        }
        
        return dp[dp.length-1];
    }
}