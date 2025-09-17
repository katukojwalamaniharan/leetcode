class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return help(nums,goal)-help(nums,goal-1);
    }
    public int help(int[] nums,int goal){
        int r=0;
        int l=0;
        int ans=0;
        int sum=0;
        if(goal<0){
            return 0;
        }
        for(r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l++];
            }
            ans+=r-l+1;
        }
        return ans;
    }
}