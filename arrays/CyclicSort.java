package arrays;

//This is the HARD question for 41 Question no . on leetcode
public class CyclicSort {
    public static int sort(int nums[]){
        for(int i=0;i<nums.length;i++){
            while (nums[i]>0 && nums[i]<nums.length && nums[nums[i]-1]!=nums[i]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i]=temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    public static void main(String[] args) {
        int nums[]={4,3,5,6,2,46,9};
        System.out.println(" "+sort(nums));

        for(int i : nums){
            System.out.print(i+", ");
        }

    }
}
