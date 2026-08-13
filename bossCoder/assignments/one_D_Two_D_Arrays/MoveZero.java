package bossCoder.assignments.one_D_Two_D_Arrays;

public class MoveZero {
    public void moveZeroes(int[] nums){
        int k=0,i=0;
        while(i<nums.length){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k++;
            }
            i++;
        }

    }
}
