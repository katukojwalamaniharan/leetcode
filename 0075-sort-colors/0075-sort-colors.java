class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l = 0;
        int m = 0;
        int h = n-1;
        while(m<=h){
            int num = nums[m];
            if(num == 1){
                m++;
            }else if(num == 0){
                int temp = nums[m];
                nums[m] = nums[l];
                nums[l] = temp;
                m++;
                l++;
            }else{
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                h--;
            }
        }
    }
}