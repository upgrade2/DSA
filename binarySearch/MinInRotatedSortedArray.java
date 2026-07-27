package binarySearch;

import java.util.Arrays;

public class MinInRotatedSortedArray {
    //T -> must be O(log(n)) Binary Search.
    static int findMin(int[] nums) {
        int low = 0 , high = nums.length-1;
        int ans = nums[0];
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[low]<=nums[mid]){
                ans = Math.min(ans,nums[low]);
                low = mid+1;
            }
            else{
                high = mid-1;
                ans = Math.min(ans,nums[mid]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input ={2,1};
        System.out.println("Ans : "+findMin(input));
    }
}
