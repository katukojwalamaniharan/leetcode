class Solution {
    public void nextPermutation(int[] nums) {
        int p = -1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]) {
                p = i-1;
                break;
            }
        }
        if(p == -1) {
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>p;i--){
            if(nums[i]>nums[p]){
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p] = temp;
                break;
            }
        }
        reverse(nums,p+1,nums.length-1);
    }
    public void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}