package arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int left =0;
        for(int right=0;right<nums.length;right++){
            if(nums.length>1){
                if(nums[right]!=0){
                    int temp = nums[right];
                    nums[right]=nums[left];
                    nums[left]=temp;
                    left++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}
