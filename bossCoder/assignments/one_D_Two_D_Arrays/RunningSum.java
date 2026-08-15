package bossCoder.assignments.one_D_Two_D_Arrays;

public class RunningSum {
    /**
    Input 2: nums = [1,1,1,1,1]
    Output 2: [1,2,3,4,5]
    Constraints:
    1 <= nums.length <= 1000
    -106 <= nums[i] <= 106
    * */
    static int[] sum(int[]  input){
        int sum=0;
        for(int i=0;i<input.length;i++){
            sum +=input[i];
            input[i] =sum;
        }
       return input;
    }
}
