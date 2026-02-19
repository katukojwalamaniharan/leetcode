class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l<r){
            char left =  s.charAt(l);
            char right = s.charAt(r);
            if(left!=right){
                return (help(s,l+1,r) || help(s,l,r-1));
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean help(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}