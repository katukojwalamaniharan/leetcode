class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[46];
        Arrays.fill(dp,-1);
        return solve(0,n);
    }
    public int solve(int idx,int n){
        if(idx > n) return 0;
        if(idx == n) return 1;
        if(dp[idx]!=-1){
            return dp[idx];
        }
        return dp[idx] = solve(idx+1,n)+solve(idx+2,n);
    }
}