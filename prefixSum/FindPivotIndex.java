package prefixSum;

import java.sql.SQLOutput;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int[] pre = new int[nums.length];
        int sum=nums[0];
        pre[0]=0;
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            pre[i] = pre[i-1] + nums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(pre[i] == sum - nums[i]-pre[i])return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        FindPivotIndex object = new FindPivotIndex();
        int[] nums ={1,7,3,6,5,6};
        System.out.println("Result::"+object.pivotIndex(nums));
    }
}
