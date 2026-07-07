package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //Sorting the Input.
        Arrays.sort(nums);
        //logic
        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i+1;
            int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];

                    if(sum>0){
                        right--;
                    }
                    else if (sum<0)
                    {
                        left++;
                    }
                    else {
                       result.add(List.of(nums[i],nums[left],nums[right]));
                       left++;
                       right--;
                       while (left<right && nums[left]==nums[left-1]) left++;
                       while (left<right && nums[right]==nums[right+1]) right--;
                    }
                }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] input ={-1,0,1,2,-1,-4};

        System.out.println(new ThreeSum().threeSum(input));
    }
}
