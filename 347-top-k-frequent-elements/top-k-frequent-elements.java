class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){map.put(num,map.getOrDefault(num,0)+1);}
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int key:map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] ans = new int[k];
        int j=0;
        for(int i=nums.length;i>=0&&j<k;i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    ans[j++] = num;
                    if(j == k) break;
                }
            }
        }
        return ans;
    }
}