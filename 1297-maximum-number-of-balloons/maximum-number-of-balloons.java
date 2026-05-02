class Solution {
    public int maxNumberOfBalloons(String text) {
        int [] freq = new int[26];
        for(int i=0;i<text.length();i++){
            char c = text.charAt(i);
            freq[c-'a']++;
        }
        return Math.min(
            Math.min(freq['b'-'a'],freq['a'-'a']),
            Math.min(
                Math.min(freq['l'-'a']/2,freq['o'-'a']/2),
                freq['n'-'a']
            )
        );
    }
}