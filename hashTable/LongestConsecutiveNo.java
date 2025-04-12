package hashTable;

import java.util.Arrays;
import java.util.Map;

public class LongestConsecutiveNo {

    public static int longestConsecutive(int[] nums) {

        if(nums.length==0)return 0;
        int[] sortedArray= Arrays.stream(nums).sorted().toArray();
        int result = 0,count=0;

        int i=1;
        while(i<sortedArray.length){
            if(sortedArray[i]-sortedArray[i-1]==1){
                count++;
                result = Math.max(count,result);
            }
            else if (sortedArray[i-1] == sortedArray[i]) {

            }
            else count=0;
            i++;
        }

        return result+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,2};//{0,3,7,2,5,8,4,6,0,1};//{100,4,200,1,3,2};
        System.out.println("Result : "+longestConsecutive(nums));
    }
}
