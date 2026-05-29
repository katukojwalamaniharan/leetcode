class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] ans = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)->a.freq-b.freq
        );
        for(int key:map.keySet()){
            pq.offer(new Pair(map.get(key),key));
            if(pq.size()>k)pq.poll();
        }
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll().num;
        }
        return ans;
    }
}
class Pair{
    int freq;
    int num;
    Pair(int x,int y){
        freq = x;
        num = y;
    }
}