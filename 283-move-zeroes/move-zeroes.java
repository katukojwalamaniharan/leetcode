class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int l=0;
        int i=0;
        //for(int i=0;i<n;i++){
        while(i<n){
           if(nums[i]!=0){
                int temp=nums[l];
                nums[l]=nums[i];
                nums[i]=temp;
                l++;
           }
        i++;
        } 
    }
}