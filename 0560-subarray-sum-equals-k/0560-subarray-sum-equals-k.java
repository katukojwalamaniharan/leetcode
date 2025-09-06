import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Long, Integer> freq = new HashMap<>(); // prefixSum -> count of occurrences
        freq.put(0L, 1);           // base: one way to have prefix sum 0 (empty prefix)
        long sum = 0L;
        int count = 0;

        for (int num : nums) {
            sum += num;                       // current prefix sum
            long need = sum - (long) k;       // we want previous prefixSum == need
            count += freq.getOrDefault(need, 0);
            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
