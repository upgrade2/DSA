package twoPointers;

import java.util.*;

public class MaxOperationKSum1679 {
    public static int maxOperations(int[] nums, int k) {
        int ans=0 , left=0 , right =nums.length-1;
        Arrays.sort(nums);
        while(left<right){
            int sum =nums[left]+nums[right];
            if(sum<k)left++;
            else if (sum>k)right--;
            else {
                left++;
                right--;
                ans++;
            }
            }
        return ans;

        }



    public static void main(String[] args) {
        int[] nums={3,1,3,4,3}; // {1,2,3,4};
        int k = 6;
        System.out.println("Result:"+maxOperations(nums,k));
    }
}
