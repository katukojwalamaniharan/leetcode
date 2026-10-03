class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> s_map = new HashMap<>();
        HashMap<Character,Integer> p_map = new HashMap<>();
        for(char c:p.toCharArray()) p_map.put(c,p_map.getOrDefault(c,0)+1);
        int i=0;
        int j=0;
        List<Integer> ans = new ArrayList<>();
        while(i<s.length()){
            char ch = s.charAt(i);
            s_map.put(ch,s_map.getOrDefault(ch,0)+1);
            if(i-j+1>p.length()){
                s_map.put(s.charAt(j),s_map.get(s.charAt(j))-1);
                if(s_map.get(s.charAt(j))==0) s_map.remove(s.charAt(j));
                j++;
            }
            if(s_map.equals(p_map)) ans.add(j);
            i++;
        }
        return ans;
    }
}