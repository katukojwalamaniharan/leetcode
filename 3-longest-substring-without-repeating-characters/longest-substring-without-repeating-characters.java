class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=0,j=0,ans=0,len=0;
        while(j<n){
            char c=s.charAt(j);
            if(hm.containsKey(c)){
                i=Math.max(i,hm.get(c)+1);
            }
            hm.put(c,j);
            len=j-i+1;
            ans=Math.max(ans,len);
            j++;
        }
        return ans;
    }
}