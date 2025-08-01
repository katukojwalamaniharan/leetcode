class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=0;
        int m=0;
        int r=s.length()-1;
        int q=t.length()-1;
        while(l<=r&&m<=q){
            if(s.charAt(l)==t.charAt(m)){
                l++;
                m++;
            }else{
                m++;
            }
        }
        if(l==r+1){
            return true;
        }else{
            return false;
        }
    }
}