class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            int a = expand(s,i,i);
            int b = expand(s,i,i+1);
            int len = Math.max(a,b);
            if(len>ans){
                ans = len;
                start = i - (len-1)/2;
            }
        }
        return s.substring(start,start+ans);
    }
    public int expand(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}