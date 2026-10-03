class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String st = s+s;
        return st.substring(1,st.length()-1).contains(s);
    }
}