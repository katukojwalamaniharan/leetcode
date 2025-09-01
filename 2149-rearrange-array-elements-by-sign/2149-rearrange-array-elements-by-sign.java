class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int [n/2];
        int[] neg=new int [n/2];
        int c1=0;
        int c2=0;
        for(int x:nums){
            if(x>0){
                pos[c1++]=x;
            }else{
                neg[c2++]=x;
            }
        }
        int j=0;
        for(int i=0;i<n/2;i++){
            nums[i*2]=pos[i];
            nums[i*2+1]=neg[i];
        }
        return nums;
    }
}