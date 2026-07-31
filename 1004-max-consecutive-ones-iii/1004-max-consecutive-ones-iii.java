class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int i = 0;
        int j = 0;
        int z = 0;
        while(j<nums.length){
            int num = nums[j];
            if(num == 0) z++;
            while(z>k){
                if(nums[i] == 0) z--;
                i++;
            } 
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}