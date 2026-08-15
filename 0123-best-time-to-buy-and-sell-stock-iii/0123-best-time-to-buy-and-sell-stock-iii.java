class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int fb = Integer.MIN_VALUE;
        int sb = Integer.MIN_VALUE;
        int fs = 0;
        int ss = 0;
        for(int num : prices){
            fb = Math.max(fb,-num);
            fs = Math.max(fs,fb + num);
            sb = Math.max(sb,fs-num);
            ss = Math.max(ss,sb+num);
        }
        return ss;
    }
}