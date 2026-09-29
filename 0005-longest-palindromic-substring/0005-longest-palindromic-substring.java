class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            int l1 = expand(s,i,i);
            int l2 = expand(s,i,i+1);
            int len = Math.max(l1,l2);
            if(len>ans){
                ans = len;
                start = i - (len-1)/2;
            }
        }
        return s.substring(start,start+ans);
    }
    public int expand(String s,int left,int right){
        while(left>=0 && right<s.length() && (s.charAt(left) == s.charAt(right))){
            left--;
            right++;
        }
        return right-left-1;
    }
}