class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            int num = prices[i];
            if(num<min) min = num;
            ans = Math.max(ans,num-min);
        }
        return ans;
    }
}