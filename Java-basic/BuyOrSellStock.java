public class BuyOrSellStock {
    public static int maxProfit(int prices[]){
        int maxProfit =0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>buyPrice){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            } else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String age[]){
        int[] prices = {7,1,5,3,6,4};
        System.out.print(maxProfit(prices));
    }
}
