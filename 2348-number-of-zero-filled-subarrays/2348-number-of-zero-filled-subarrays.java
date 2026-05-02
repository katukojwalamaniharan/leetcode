class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int k = 0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(num == 0) {
                k++;
                // ans+=k;
            }else{
                ans+=(long)(k*(k+1))/2;
                k=0;
            }
        }
        ans += (long)k * (k + 1) / 2;
        return ans;
    }
}