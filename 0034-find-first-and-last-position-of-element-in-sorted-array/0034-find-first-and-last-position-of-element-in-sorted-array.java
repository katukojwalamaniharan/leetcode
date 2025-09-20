class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        int left=lb(nums , target);
        int right=ub(nums , target);
        if(left==nums.length||nums[left]!=target) return new int[]{-1,-1};
        return new int[]{left,right-1};
    }
    public int lb(int[] nums,int target){
        int l=0;
        int h=nums.length-1;
        int ans=nums.length;
        while(l<=h){
            int mid=l+(h-l)/2;
            // ans=nums.length;
            if(nums[mid]>=target){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int ub(int[] nums,int target){
        int l=0;
        int h=nums.length-1;
        int anss=nums.length;
        while(l<=h){
            int mid=l+(h-l)/2;
            // int anss=nums.length;
            if(nums[mid]>target){
                anss=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return anss;
    }
}