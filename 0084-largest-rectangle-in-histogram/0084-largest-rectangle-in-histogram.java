class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==1) return heights[0];
        return 2*secondLargest(heights);
    }
static int secondLargest(int[] arr) {
    if (arr == null || arr.length < 2) {
        return -1; // not possible
    }

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int x : arr) {
        if (x > largest) {
            secondLargest = largest;
            largest = x;
        } else if (x < largest && x > secondLargest) {
            secondLargest = x;
        }
    }

    return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
}
}
