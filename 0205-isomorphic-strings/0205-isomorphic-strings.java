class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> a = new HashMap<>();
        HashMap<Character,Integer> b = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(!a.containsKey(s.charAt(i))){
                a.put(s.charAt(i),i);
            }
            if(!b.containsKey(t.charAt(i))){
                b.put(t.charAt(i),i);
            }
            if(!a.get(s.charAt(i)).equals(b.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}