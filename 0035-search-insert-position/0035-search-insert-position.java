class Solution {
    public int searchInsert(int[] nums, int target) {
        int k=0;
        int l=0;
        int h=nums.length-1;
        //int mid=;
       while(l<=h){
        int mid=l+(h-l)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            l=mid+1;
        }
        else{
            h=mid-1;
         }
       }
       return l;
    }
}