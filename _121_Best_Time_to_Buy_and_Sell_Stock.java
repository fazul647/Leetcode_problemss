public class _121_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
        int profitToday = prices[i] - minPrice;
        maxProfit = Math.max(maxProfit, profitToday);
        minPrice = Math.min(minPrice, prices[i]);
    }

    return maxProfit;
    }
    
}
