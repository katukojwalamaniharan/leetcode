class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                pivot=i-1;
                break;
            }
        }
        if(pivot==-1){
            int i=0;
            int j=n-1;
            while(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            return;
        }
        int max=pivot+1;
        for(int i=pivot+1;i<n;i++){
            if(nums[i]>nums[pivot]&&nums[i]<=nums[max]){
                max=i;
            }
        }
        int temp=nums[pivot];
        nums[pivot]=nums[max];
        nums[max]=temp;
        Arrays.sort(nums,pivot+1,n);
    }
}