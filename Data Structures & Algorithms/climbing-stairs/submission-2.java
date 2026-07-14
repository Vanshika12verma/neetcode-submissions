/*
//MEMOIZATION
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        for (int i=0; i<=n; i++) {
            dp[i] = -1;
        }
        return solve(n,dp);
    }
    private int solve(int n, int[] dp) {
        if (n<=1) return 1;
        dp[n] = solve(n-1,dp) + solve(n-2,dp);
        return dp[n];
    }
}
//TABULATION
class Solution {
    public int climbStairs(int n) {
        if (n<=1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
*/
class Solution {
    public int solve(int n, int[] dp) {
        if (n<=1) return 1;
        if (dp[n] != -1) return dp[n];
        return dp[n] = solve(n-1,dp) + solve(n-2,dp);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
}



















