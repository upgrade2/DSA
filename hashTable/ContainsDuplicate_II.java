package hashTable;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_II {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        boolean result=false;
        for(int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={1,0,1,1};//{1,2,3,1};

        System.out.println("Result : "+containsNearbyDuplicate(nums,1));
    }
}
