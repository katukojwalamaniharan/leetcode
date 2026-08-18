class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int j=0;
        int n=s.length();
        int ans = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
            while(hm.get(c)>1){
                char ch = s.charAt(j);
                hm.put(ch,hm.get(ch)-1);
                j++;
            }
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
}