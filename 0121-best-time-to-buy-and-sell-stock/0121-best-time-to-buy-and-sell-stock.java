class Solution {
    public int maxProfit(int[] prices) {
        int total_price=0;
        int n=prices.length;
        int buying_price=prices[0];
        for(int i=1;i<n;i++){
            int current_price=prices[i]-buying_price;
            if(current_price>total_price){
                total_price=current_price;
            }
            if(buying_price>prices[i]){
                buying_price=prices[i];
            }
        }
        return total_price;
    }
}