package slidingWindow;

public class BestTimeToByStock {
    public static int maxProfit(int[] prices) {
        int minPrice =Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price:prices){
            minPrice = Math.min(price,minPrice);
            maxProfit = Math.max(price-minPrice,maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] input = {5,1,5,6,7,1,10};
        System.out.println(maxProfit(input));
    }
}
