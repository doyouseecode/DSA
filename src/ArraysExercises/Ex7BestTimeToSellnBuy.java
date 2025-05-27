package ArraysExercises;

public class Ex7BestTimeToSellnBuy {
    public static void main(String[] args) {
        int[] arr = {7,3,5,3,99,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int cheapestPrice = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] - cheapestPrice > maxProfit){
                maxProfit = prices[i] - cheapestPrice;
            }
            else if(prices[i] < cheapestPrice){
                cheapestPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
