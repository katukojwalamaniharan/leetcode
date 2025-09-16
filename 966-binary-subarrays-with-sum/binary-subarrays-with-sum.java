class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        int sum=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int diff=sum-goal;
            // if(hm.containsKey(diff)){
                count+=hm.getOrDefault(diff,0);
            // }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}