class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=0;i<n-1;i++){
            ans[i+1]=ans[i]*nums[i];
        }
        int postfix=1;
        ans[n-1]=ans[n-1]*postfix;
        for(int i=n-1;i>0;i--){
            postfix=nums[i]*postfix;
            ans[i-1]=ans[i-1]*postfix;
        }
        return ans;
    }
}