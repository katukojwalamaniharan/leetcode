class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int i=0;
        int j=0;
        int n=s.length();
        int ans = 0;
        while(j<n){
            char c = s.charAt(j);
            if(!hm.containsKey(c)){
                hm.put(c,j);
            }else{
                i=Math.max(i,hm.get(c)+1);
                hm.put(c,j);
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}