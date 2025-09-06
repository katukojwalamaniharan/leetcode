class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        while(i<nums.length&&j<nums.length){
            if(nums[i]!=val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
            i++;
        }
        return j;
    }
}