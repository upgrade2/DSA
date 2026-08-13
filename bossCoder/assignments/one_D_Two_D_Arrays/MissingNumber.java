package bossCoder.assignments.one_D_Two_D_Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n * (n+1))/2;
        for(int i=0;i<n;i++){
            totalSum -= nums[i];
        }
        return totalSum;
    }
}
