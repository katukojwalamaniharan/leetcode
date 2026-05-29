class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        List<String>[] bucket = new ArrayList[words.length+1];
        HashMap<String,Integer> hm = new HashMap<>();
        for(String word:words) hm.put(word,hm.getOrDefault(word,0)+1);
        for(String key:hm.keySet()){
            int freq = hm.get(key);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<String>();
            }
            bucket[freq].add(key);
        }
        for(int i=words.length;i>0&&k>0;i--){
            if(bucket[i]!=null){
                Collections.sort(bucket[i]);
                for(String s:bucket[i]){
                    if(k == 0) break;
                    ans.add(s);
                    k--;
                }
            }
        }
        return ans;
    }
}