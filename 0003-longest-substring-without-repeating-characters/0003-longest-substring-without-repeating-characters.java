class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int count = 0;
        int j = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(j));
                j++;
            }
            hs.add(s.charAt(i));
            count = i-j+1;
            ans = Math.max(ans,count);
        }
        return ans;
    }
}