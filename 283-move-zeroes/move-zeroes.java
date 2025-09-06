class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        int n=nums.length;
        while(i<n&&j<n){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        while(j<n){
            nums[j++]=0;
        }
    }
}