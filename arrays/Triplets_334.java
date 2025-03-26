package arrays;

public class Triplets_334 {
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        // Traverse the array
        for (int num : nums) {
            // If current number is less than or equal to the first, update first
            if (num <= first) {
                first = num;
                // Else if current number is less than or equal to the second, update second
            } else if (num <= second) {
                second = num;
                // Else we found a number greater than both first and second
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]= {1,5,0,4,1,3};
                //{20,100,10,12,5,13};
                //{1,2,3,4,5};
        System.out.print("Result: "+increasingTriplet(nums));

    }
}
