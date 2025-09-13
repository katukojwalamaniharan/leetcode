class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            Set<Character> ss=new HashSet<>();
            int count=0;
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                if(!ss.contains(c)){
                    count++;
                    ss.add(c);
                }else{
                    break;
                }
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}