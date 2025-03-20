package Arrays;

public class Sort_0_and_1 {

    public static void sort(int[] nums){
        int i =0,j=0;
        while(j<nums.length){
            if(nums[j]==0){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
            j++;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,0,0,1,0,1,1,1,0};
        sort(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
