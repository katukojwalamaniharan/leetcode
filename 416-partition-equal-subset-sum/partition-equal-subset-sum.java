class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i:nums) sum+=i;
        if(sum%2 != 0) return false;
        int target = sum/2;
        return checkSubsequenceSum(nums,target);
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        Boolean[][] dp = new Boolean[arr.length][k + 1];
        return solve(0,arr,k,dp);
        
    }
    public boolean solve(int i,int[] arr, int k,Boolean[][] dp){
        if(k == 0) return true;
        if(i == arr.length || k<0) return false;
        if (dp[i][k] != null) {
            return dp[i][k];
        }
        boolean pick = solve(i+1,arr,k-arr[i],dp);
        boolean notPick = solve(i+1,arr,k,dp);
        return dp[i][k]=pick||notPick;
    }
}