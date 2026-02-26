class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int c = n-1;
        int count = 0;
        while(c>=2){
            int a = 0;
            int b = c-1;
            while(a<b){
                if(nums[a]+nums[b]>nums[c]){
                    count+=b-a;
                    b--;
                }else{
                    a++;
                }
            }
            c--;
        }
        return count;
    }
}