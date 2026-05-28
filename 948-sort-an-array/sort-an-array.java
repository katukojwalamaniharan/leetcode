class Solution {
    public int[] sortArray(int[] nums) {
        int[] ans = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:nums){
            pq.offer(num);
        }
        for(int i=0;i<ans.length;i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}