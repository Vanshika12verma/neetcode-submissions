/*
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i=2; i<n; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
        return Math.min(dp[n-1], dp[n-2]);
    }
}
*/
class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(solve(n-1,cost), solve(n-2,cost));
    }
    public int solve(int i, int[] cost) {
        if (i==0) return cost[0];
        if (i==1) return cost[1];
        if (dp[i]!=-1) return dp[i];
        return dp[i] = cost[i] + Math.min(solve(i-1,cost),solve(i-2,cost));
    }
}

















