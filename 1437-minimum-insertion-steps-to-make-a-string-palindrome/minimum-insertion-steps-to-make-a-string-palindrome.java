class Solution {
    public int minInsertions(String s) {
        char[] a = s.toCharArray();
        int[][] dp = new int[a.length][a.length];
        for(int i[]:dp)Arrays.fill(i,-1);
        return help(a,0,a.length-1,dp);
    }
    public int help(char[] a,int i,int j,int[][] dp){
        if(i == j || i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a[i] == a[j]) return help(a,i+1,j-1,dp);
        int m = help(a,i+1,j,dp);
        int n = help(a,i,j-1,dp);
        return dp[i][j] = 1+Math.min(m,n); // we are inserting one character so we add 1
    }
}