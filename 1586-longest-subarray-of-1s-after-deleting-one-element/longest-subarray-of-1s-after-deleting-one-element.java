class Solution {
    public int longestSubarray(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int zc=0;
            int len=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0)zc++;
                if(zc>1){
                    break;
                }
                len=j-i;
            }
            ans=Math.max(ans,len);
        }
        return ans;
    }
}