class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0;
        int n=s.length();
        int mfq=0;
        int ans=0;
        // HashMap<Character,Integer> hm=new HashMap<>();
        int[] a=new int[26];
        while(r<n){
            char c=s.charAt(r);
            // hm.put(c,hm.getOrDefault(c,0)+1);
            a[c-'A']++;
            // mfq=Math.max(mfq,hm.get(c));
            mfq=Math.max(mfq,a[c-'A']);
            while((r-l+1)-mfq>k){
                // hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                // if(hm.get(s.charAt(l))==0) hm.remove(s.charAt(l));
                a[s.charAt(l)-'A']--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}