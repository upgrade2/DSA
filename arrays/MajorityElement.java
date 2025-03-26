package arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int result=nums[0];
        int count=0;
        for(int i: nums){
            if(count==0){
                result=i;
            }
            count +=(i==result)?1:-1;
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[]=new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

}
