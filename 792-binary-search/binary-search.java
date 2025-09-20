class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        return bs(l,h,nums,target);
    }
    public int bs(int l,int h,int[] nums,int target){
        if(l>h) return -1;
        int mid=l+(h-l)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) return bs(l,mid-1,nums,target);
        return bs(mid+1,h,nums,target);
    }
}