class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] temp = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            temp[nums[i]]++;
        }
        for(int i=1;i<temp.length;i++){
            if(temp[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
}