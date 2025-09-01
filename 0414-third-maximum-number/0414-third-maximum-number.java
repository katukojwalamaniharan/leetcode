import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int x : nums) {
            set.add(x);          // only keeps distinct
            if (set.size() > 3)  // remove smallest if > 3
                set.pollFirst();
        }
        
        return set.size() == 3 ? set.first() : set.last();
    }
}
