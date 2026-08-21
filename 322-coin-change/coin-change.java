class Solution {
    public int coinChange(int[] coins, int amount) {
        int ans = -1;
        int n = coins.length;
        int INF = Integer.MAX_VALUE / 2;
        int dp[][] = new int[n+1][amount+1];
        for(int i=0;i<=n;i++) dp[i][0] = 0;
        for(int j = 1; j <= amount; j++) {
            dp[0][j] = INF;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                int inc = Integer.MAX_VALUE,exc = dp[i-1][j];

                if(coins[i-1]<=j){
                    inc = 1+dp[i][j-coins[i-1]];
                }
                dp[i][j] = Math.min(inc,exc);
                // System.out.print(dp[i][j]+"  ");
            }
            // System.out.println();
        }
        return dp[n][amount]!=INF?dp[n][amount]:-1;
    }
}