package slidingWindow;

public class BestTimeToByStock {
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int n=prices.length;
        for(int i=0;i<n-1;i++){
           for(int j=i;j<n-1;j++){
              int profit =prices[j]-prices[i];
               if(profit>0){
                   maxProfit = Math.max(profit,maxProfit);
               }
           }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] input = {5,1,5,6,7,1,10};
        System.out.println(maxProfit(input));
    }
}
