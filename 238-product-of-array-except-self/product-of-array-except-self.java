class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int p1 = 1;
        int p2 = 1;
        for (int i = 0; i < n; i++) {
            p1 *= nums[i];
            p2 *= nums[n-1-i];
            prefix[i]=p1;
            postfix[n-1-i]=p2;
        }
        for(int i=0;i<n;i++){
            int left=(i==0)?1:prefix[i-1];
            int right=(i==(n-1))?1:postfix[i+1];
            nums[i]=left*right;
        }
        return nums;
    }
}