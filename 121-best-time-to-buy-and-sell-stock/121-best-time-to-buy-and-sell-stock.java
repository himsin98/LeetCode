class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int price: prices){
            if(price<min){
                min = price;
            }else if(price-min>profit){
                profit = price-min;
            }
        }
        return profit;
    }
}