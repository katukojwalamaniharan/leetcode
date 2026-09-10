class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int k = rd(arr);
        for(int i=0;i<k;i++) ans.add(arr[i]);
        return ans;
    }
    public int rd(int[] nums) {
            if(nums.length == 0) return 0;
            int i=0;
            for(int j=1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    nums[++i] = nums[j];
                }
            }
            return i+1;
    }
}
