class Solution {
    public int maxProfit(int[] prices) {
        int tp=0;
        int n=prices.length;
        int bp=prices[0];
        for(int i=1;i<n;i++){
            int cp=prices[i]-bp;
            if(cp>tp){
                tp=cp;
            }
            if(bp>prices[i]){
                bp=prices[i];
            }
        }
        return tp;
    }
}