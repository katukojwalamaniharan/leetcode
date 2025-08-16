class Solution {
    public int maximum69Number(int num) {
        int temp = num;
        int place = 1;           // digit place (1, 10, 100...)
        int firstSixPlace = 0;   // position of first 6 from right

        // Find the leftmost 6 by traversing digits from right to left
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 6) {
                firstSixPlace = place; // store the place of the first 6
            }
            temp /= 10;
            place *= 10;
        }

        // If there was a 6, change it to 9
        return num + firstSixPlace * 3; // 9 - 6 = 3
    }
}
