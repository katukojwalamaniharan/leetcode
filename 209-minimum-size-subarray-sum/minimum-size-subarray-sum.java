class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0;
        int len=0;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        for(r=0;r<nums.length;r++){
            sum+=nums[r];
                while(sum>=target){
                    ans=Math.min(ans,r-l+1);
                    sum-=nums[l];
                    l++;
                }
            }
        return (ans==Integer.MAX_VALUE)?0:ans;
    }
}