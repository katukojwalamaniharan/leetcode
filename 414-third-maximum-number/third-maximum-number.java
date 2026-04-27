class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(set);

        if (pq.size() < 3) return pq.peek();

        for (int i = 1; i < 3; i++) {
            pq.poll();
        }

        return pq.peek();
    }
}