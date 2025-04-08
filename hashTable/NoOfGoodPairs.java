package hashTable;

import java.util.Arrays;
import java.util.HashMap;

public class NoOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int num:nums){

            if(map.containsKey(num)){
                count+=map.get(num);
                map.put(num,map.get(num)+1);
            }
            else {
                map.put(num,1);
            }

        }

        return count;
    }
    public static void main(String[] args) {
        int nums[] ={1,2,3,1,1,3};
        System.out.println("Result : "+numIdenticalPairs(nums));
    }
}
