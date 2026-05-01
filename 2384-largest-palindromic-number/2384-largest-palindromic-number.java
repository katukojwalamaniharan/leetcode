class Solution {
    public String largestPalindromic(String num) {
        int[] freq = new int[10];

        // count frequency
        for (char c : num.toCharArray()) {
            freq[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        int mid = -1;

        // build left half from 9 → 0
        for (int d = 9; d >= 0; d--) {
            if (freq[d] % 2 == 1 && mid == -1) {
                mid = d;
            }

            int pairs = freq[d] / 2;

            // skip leading zero
            if (d == 0 && sb.length() == 0) continue;

            for (int i = 0; i < pairs; i++) {
                sb.append(d);
            }
        }

        // all-zero case or single digit
        if (sb.length() == 0) {
            return mid == -1 ? "0" : String.valueOf(mid);
        }

        String right = new StringBuilder(sb).reverse().toString();

        if (mid != -1) {
            return sb.toString() + mid + right;
        }

        return sb.toString() + right;
    }
}