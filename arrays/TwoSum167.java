package arrays;

public class TwoSum167 {

    public static int[] twoSum(int nums[],int target){

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{i, j};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int nums[] = {2,7,15,16,20};
        int target = 23;
        for(int i : twoSum(nums,target)){
            System.out.print(i+" ");
        }
    }
}
