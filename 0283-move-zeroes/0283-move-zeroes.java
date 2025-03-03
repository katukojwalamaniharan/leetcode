class Solution {
    public void moveZeroes(int[] nums) {
        Scanner s=new Scanner(System.in);
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }
        while(index<nums.length){
            nums[index++]=0;
        }
        //return
    }
}