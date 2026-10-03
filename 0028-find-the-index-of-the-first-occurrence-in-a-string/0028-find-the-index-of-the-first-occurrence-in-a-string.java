class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int s = 0;
        while (s <= n - m) {
            int i = s;
            int j = 0;
            while (j < m) {
                if (haystack.charAt(i) != needle.charAt(j)) {
                    break;
                } else {
                    i++;
                    j++;
                }
            }

            if (j == m) {
                return s;
            }

            s++;
        }

        return -1;
    }
}