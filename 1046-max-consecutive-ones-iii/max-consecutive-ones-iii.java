class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int zc=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0) zc++;
                if(zc>k)break;
                ans=Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}