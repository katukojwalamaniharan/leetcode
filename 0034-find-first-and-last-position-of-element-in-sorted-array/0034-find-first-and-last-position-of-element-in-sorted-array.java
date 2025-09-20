class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a={lb(nums,target),ub(nums,target)-1};
        if(a[1]<a[0]) return new int[]{-1,-1};
        return a;
    }
    public int lb(int[] nums,int target){
        int l=0;
        int h=nums.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
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
        int ans=nums.length;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>target){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}