class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1||nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int l=1;
        int h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if(nums[mid-1]==nums[mid]){
                if(((mid-1)%2!=0)&&(mid%2==0)){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if((mid%2!=0)&&(mid+1)%2!=0){
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}