class Solution {
    public int lastRemaining(int n) {
        if(n == 1) return n;
        int start = 1;
        int step  = 1;
        int rem   = n;
        boolean l = true;
        while(rem>1){
            if(l||rem%2 == 1){
                start+=step;
            }
            rem/=2;
            step*=2;
            l = !l;
        }
        return start;
    }
}