class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i:nums) sum+=i;
        if(sum%2 != 0) return false;
        int target = sum/2;
        boolean dp[][] = new boolean[n+1][target+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                boolean inc = false,exc = false;
                if(nums[i-1]<=j){
                    inc = true&&dp[i-1][j-nums[i-1]];
                }
                exc = dp[i-1][j];
                dp[i][j] = exc||inc;
            }
        }
        return dp[n][target];
    }
}