class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] seen = new boolean[128];
        int l = 0, ans = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            while (seen[c]) {
                seen[s.charAt(l)] = false;
                l++;
            }
            seen[c] = true;
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
