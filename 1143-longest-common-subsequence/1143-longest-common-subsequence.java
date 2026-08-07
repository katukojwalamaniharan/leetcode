class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()][text2.length()];
        for(int [] a:dp){
            Arrays.fill(a,-1);
        }
        return help(text1,text2,0,0,dp);
    }
    static int help(String a,String b,int i,int j,int[][] dp){
        if(i>=a.length() || j>=b.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)) return dp[i][j]=1+help(a,b,i+1,j+1,dp);
        int m = help(a,b,i+1,j,dp);
        int n = help(a,b,i,j+1,dp);
        return dp[i][j] = Math.max(m,n);
    }
}