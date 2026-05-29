class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for(char c : s.toCharArray()) {
            freq[c]++;
        }
        StringBuilder ans = new StringBuilder();
        List<Character>[] bucket = new ArrayList[s.length()+1];
        for(int i=0;i<128;i++){
            if(freq[i]>0){
                int f = freq[i];
                if(bucket[f] == null){
                    bucket[f] = new ArrayList<>();
                }
                bucket[f].add((char)i);
            }
        }
        for(int i=s.length();i>=1;i--){
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