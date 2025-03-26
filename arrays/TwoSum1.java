package arrays;

import java.util.HashMap;

//Using a HashMap and unsorted array
//o(n) and o(1)
public class TwoSum1 {
    public static int[] twoSum(int nums[],int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=9;

        for(int i : twoSum(nums,target)){
            System.out.print(i+" ");
        }

    }
}
