class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int r=0;
        int l=0;
        int[] count={0,0,0};
        int ans=0;
        for(r=0;r<n;r++){
            count[s.charAt(r)-'a']++;
            while(count[0]>0 && count[1]>0 && count[2]>0){
                ans+=n-r;
                count[s.charAt(l++)-'a']--;
            }
        }
        return ans;
    }
}