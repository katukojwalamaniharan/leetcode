class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0 || n % 3 != 0) return n == 1;
        return isPowerOfThree(n / 3);
    }
}
