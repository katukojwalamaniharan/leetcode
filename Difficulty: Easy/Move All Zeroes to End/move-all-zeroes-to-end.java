class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        moveZeroes(arr);
    }
    public void moveZeroes(int[] nums) {
            int i=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=0){
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                    i++;
                }
            }
        }
}