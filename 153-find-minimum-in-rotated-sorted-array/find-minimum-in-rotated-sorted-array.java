class Solution {
    public int findMin(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            ans=Math.min(ans,nums[mid]);
            if(nums[l]<=nums[mid]){//Right sorted.
                ans=Math.min(ans,nums[l]);
                l=mid+1;
            }else{//Left sorted.
                ans=Math.min(ans,nums[mid]);
                h=mid-1;
            }
        }
        return ans;
    }
}