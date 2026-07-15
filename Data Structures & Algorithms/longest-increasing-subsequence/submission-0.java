/*
class Solution {
    public int solve(int[] nums, int curr, int prev) {
        int n = nums.length;
        if (curr==n) return 0;
        int include = 0;
        if (prev==-1 || nums[curr]>nums[prev])
            include = 1 + solve(nums,curr+1,curr);
        int exclude = 0 + solve(nums,curr+1,prev);
        return Math.max(include,exclude);
    }
    public int lengthOfLIS(int[] nums) {
        return solve(nums,0,-1);
    }
}
*/
//MEMOIZATION
class Solution {
    public int solve(int[] nums, int curr, int prev, int[][] dp) {
        int n = nums.length;
        if (curr==n) return 0;
        if (dp[curr][prev+1]!=-1) return dp[curr][prev+1];
        int include = 0;
        if (prev==-1 || nums[curr]>nums[prev])
            include = 1 + solve(nums,curr+1,curr,dp);
        int exclude = 0 + solve(nums,curr+1,prev,dp);
        return dp[curr][prev+1] = Math.max(include,exclude);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for (int[] row : dp) {
            Arrays.fill(row,-1);
        }
        return solve(nums,0,-1,dp);
    }
}