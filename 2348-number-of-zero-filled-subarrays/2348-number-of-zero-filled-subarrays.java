class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int k = 0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(num == 0) {
                k++;
                ans+=k;
            }else{
                k=0;
            }
        }
        return ans;
    }
}