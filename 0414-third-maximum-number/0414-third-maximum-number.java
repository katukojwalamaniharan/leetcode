class Solution {
    public int thirdMax(int[] nums) {
        Long m1 = null, m2 = null, m3 = null;
        
        for (int x : nums) {
            long num = x;
            
            if ((m1 != null && num == m1) ||
                (m2 != null && num == m2) ||
                (m3 != null && num == m3)) {
                continue; // skip duplicates
            }
            
            if (m1 == null || num > m1) {
                m3 = m2;
                m2 = m1;
                m1 = num;
            } else if (m2 == null || num > m2) {
                m3 = m2;
                m2 = num;
            } else if (m3 == null || num > m3) {
                m3 = num;
            }
        }
        
        return (m3 == null) ? m1.intValue() : m3.intValue();
    }
}
