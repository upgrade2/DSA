package hashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveNo {

    public static int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        int longestLength=0;
        Map<Integer,Boolean> map = new HashMap<>();

        for(int num:nums){
            map.put(num,Boolean.FALSE);
        }

        for (int num:nums){
            int currentLength=1;
            int next = num+1;
            //Forwar direction
        while(map.containsKey(next)&&!map.get(next)){
            currentLength++;
            map.put(next,Boolean.TRUE);
            next++;
        }

            int prev = num-1;
            //Backword Direction
        while(map.containsKey(prev)&&!map.get(prev)){
            currentLength++;
            map.put(prev,Boolean.TRUE);
            prev--;
        }
        longestLength = Math.max(currentLength,longestLength);
        }


        return longestLength;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,2};//{0,3,7,2,5,8,4,6,0,1};//{100,4,200,1,3,2};
        System.out.println("Result : "+longestConsecutive(nums));
    }
}
