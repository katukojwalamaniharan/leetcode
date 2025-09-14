class Solution {
    public int longestSubarray(int[] nums) {
        int sum=0;
        int zc=0,ans=0,l=0,r=0;
        while(r<nums.length){
            if(nums[r]==0)zc++;
            if(zc>1){
                if(nums[l]==0) zc--;
                l++;
            }
            // ans=Math.max(ans,r-l);
            if((r-l)>ans)ans=r-l;
            r++;
        }
        return ans;
    }
}