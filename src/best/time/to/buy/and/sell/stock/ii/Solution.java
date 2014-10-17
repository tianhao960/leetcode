package best.time.to.buy.and.sell.stock.ii;

public class Solution{

        public int maxProfit(int[] prices) {
            if(prices==null) return 0 ;
            int profit = 0;
            for(int i = 0;i<prices.length-1;i++){
                int tempProfit = prices[i+1] - prices[i];
                tempProfit = tempProfit >0?tempProfit:0;
                profit+=tempProfit;
            }

            return profit;
        }
}
