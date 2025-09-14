class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int ans=0;
        int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         if(sum>ans){
        //             ans=sum;
        //         }
        //         sum=0;
        //     }else{
        //         sum++;
        //     }
        //     // ans=Math.max(ans,sum);
        //     if(sum>ans) ans=sum;
        // }
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(r-l+1!=sum){
                sum-=nums[l];
                l++;
            }
            // ans=Math.max(ans,sum);
            if(sum>ans)ans=sum;
        }
        return ans;
    }
}