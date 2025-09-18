class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
           nums[i]=nums[i]&1;
        }
        return help(nums,k)-help(nums,k-1);
    }
    public int help(int[] nums,int k){
        int r=0;
        int l=0;
        int rsum=0;
        int count=0;
        if(k<0) return 0;
        for(r=0;r<nums.length;r++){
            rsum+=nums[r];
            while(rsum>k){
                rsum-=nums[l++];
            }
            count+=r-l+1;
        }
        return count;
    }
}