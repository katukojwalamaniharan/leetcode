class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        List<Character>[] bucket = new ArrayList[s.length()+1];
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char key:hm.keySet()){
            int freq = hm.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<Character>();
            }
            bucket[freq].add(key);
        }
        for(int i=s.length();i>=0;i--){
            if(bucket[i]!=null){
                for(char c:bucket[i]){
                    for(int j = 0; j < i; j++) {
                        ans.append(c);
                    }
                }
            }
        }
        return ans.toString();
    }
}