class Solution {
    public void moveZeroes(int[] nums) {
        Scanner s=new Scanner(System.in);
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                //nums[index++]=nums[i];
                int temp=nums[i];
                nums[i]=nums[l];
                nums[l]=temp;
                left++
            }
        }
        // while(index<nums.length){
        //     nums[index++]=0;
        // }
        //return
    }
}