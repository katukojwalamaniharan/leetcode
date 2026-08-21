class Solution {
    public int minDistance(String a, String b) {
        int n = a.length();
        int m = b.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = n;i>=0;i--){
            dp[i][m] = n-i;
        }
        for(int j = m;j>=0;j--){
            dp[n][j] = m-j;
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(a.charAt(i) == b.charAt(j)){
                    dp[i][j] = dp[i+1][j+1];
                }else{
                    dp[i][j] = 1 + Math.min(dp[i+1][j+1],Math.min(dp[i+1][j], dp[i][j+1]));
                }
            }
        }
        return dp[0][0];
    }
}