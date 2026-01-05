class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] a1 = new int[128];
        int[] a2 = new int[128];
        Arrays.fill(a1,-1);
        Arrays.fill(a2,-1);
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(a1[a]!=a2[b]) return false;
            a1[a] = i;
            a2[b] = i;
        }
        return true;
    }
}