class Solution {
    public int maxProfit(int[] prices) {
        int total_price=0;
        int buying_price=prices[0];
        for(int i=1;i<prices.length;i++){
            int current_price=prices[i]-buying_price;
            total_price=Math.max(total_price,current_price);
            buying_price=Math.min(buying_price,prices[i]);
        }
        return total_price;
    }
}