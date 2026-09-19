class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        int n = s1.length();
        for(int i=0;i<n;i++) hm1.put(s1.charAt(i),hm1.getOrDefault(s1.charAt(i),0)+1);
        // sliding window initialization
        int i = 0;
        int j = 0;
        while(i<s2.length() && j<s2.length()){
            char c = s2.charAt(i);
            hm2.put(c,hm2.getOrDefault(c,0)+1);
            if(i-j+1 == n){
                if(hm1.equals(hm2)) return true;
                char fc = s2.charAt(j++);
                hm2.put(fc,hm2.get(fc)-1);
                if(hm2.get(fc)==0) hm2.remove(fc);
            }
            i++;
        }
        return false;
    }
}