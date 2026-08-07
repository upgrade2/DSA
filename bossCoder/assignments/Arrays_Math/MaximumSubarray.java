package bossCoder.assignments.Arrays_Math;

public class MaximumSubarray {

    static int maxLen(int[]  input){
        int max= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<input.length;i++){
            sum += input[i];
            if(sum>max)max=sum;
            if(sum<0)sum=0;
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
