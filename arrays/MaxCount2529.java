package arrays;

public class MaxCount2529 {
    public static int maximumCount(int[] nums) {
        int pCount=0,nCount=0;
        for(int i:nums){
            if(i<0){pCount++;}
            if(i>0){nCount++;}
        }
       if(pCount>nCount){
           return pCount;
       }
       else return nCount;
    }

    public static void main(String[] args) {
        int nums[]={-2,-1,-1,1,2,3,3,3-1};
        System.out.print(maximumCount(nums));

    }
}
