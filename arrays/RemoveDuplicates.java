package arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
    int count=0;
    for(int i=1;i<nums.length;i++){
        if(nums[count]!= nums[i]){
            count++;
            nums[count]=nums[i];
        }
    }
    return count+1;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{0,0,1,1,1,2,2,3,3,4};
      //  int nums[]=new int[]{};
        int result = removeDuplicates(nums);
        System.out.println(" result:"+result);
       for(int i :nums){
           System.out.print(i+" ");
       }
    }

}
