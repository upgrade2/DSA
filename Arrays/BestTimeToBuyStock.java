package Arrays;

public class BestTimeToBuyStock {
        public static int maxProfit(int[] prices) {
            int count=0;
            int i=0;
            for(int j=0;j<prices.length;j++)
            {
                if(prices[i]>prices[j])i=j;
                int val = prices[j]-prices[i];
                count=(val>count)?val:count;

            }
            return count;
        }

    public static void main(String[] args) {
        int nums[] = new int[] {7,1,5,3,6,4};
        System.out.println("Result:"+maxProfit(nums));
    }

}
