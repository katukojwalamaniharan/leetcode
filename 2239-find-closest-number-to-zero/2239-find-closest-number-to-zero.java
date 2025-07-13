class Solution {
    public int findClosestNumber(int[] nums) {
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<Math.abs(min)){
                min=nums[i];
            }
        }
        if(min>0){
            return min;
        }else{
            int ans=1;
            for(int i=0;i<nums.length;i++){
                if(Math.abs(min)==Math.abs(nums[i])){
                    ans=nums[i];
                }
            }
            return ans;
        }
    }
}