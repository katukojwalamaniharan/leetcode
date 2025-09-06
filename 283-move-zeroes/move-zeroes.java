class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int i=0;
        int n=nums.length;
        while(i<n&&j<n){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
            i++;
        }
    }
}