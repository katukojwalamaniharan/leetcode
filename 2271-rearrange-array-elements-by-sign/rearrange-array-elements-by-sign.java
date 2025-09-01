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
        int i=0;int j=0;
        int k=0;
        while(i<pos.length&&j<neg.length){
            nums[k++]=pos[i++];
            nums[k++]=neg[j++];
        }
        return nums;
    }
}