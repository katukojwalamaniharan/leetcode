class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, zc = 0, ans = 0,r=0;
        // for (int r = 0; r < nums.length; r++) {
        //     if (nums[r] == 0) zc++;
        //     while (zc > k) {
        //         if (nums[l] == 0) zc--;
        //         l++;
        //     }
        //     ans = Math.max(ans, r - l + 1);
        // }
        while(r<nums.length){
            if(nums[r]==0)zc++;
            if(zc>k){
                if(nums[l]==0) zc--;
                l++;
            }
            if(zc<=k) ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}