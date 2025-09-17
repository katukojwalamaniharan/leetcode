class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a=new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }
        for(int x:a) if(x!=0) return false;
        return true;
    }
}