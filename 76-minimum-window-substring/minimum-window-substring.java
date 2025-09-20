class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        HashMap<Character,Integer> hm =new HashMap<>();
        int r=0,l=0;
        int min=Integer.MAX_VALUE;
        int count=0;
        int idx=-1;
        for(int i=0;i<m;i++){
            hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)+1);
        }
        for(r=0;r<n;r++){
            char c=s.charAt(r);
            if(hm.containsKey(c)&&hm.get(c)>0) count++;
            hm.put(c,hm.getOrDefault(c,0)-1);
            while(count==m){
                if((r-l+1)<min){
                    min=r-l+1;
                    idx=l;
                }
                hm.put(s.charAt(l),hm.getOrDefault(s.charAt(l),0)+1);
                if(hm.get(s.charAt(l))>0) count--;
                l++;
            }
        }
        if (idx == -1) return "";
        return s.substring(idx,idx+min);
    }
}