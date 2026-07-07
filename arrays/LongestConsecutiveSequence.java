package arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
    if(nums.length==0)return 0;
    int longest =1;
    HashSet<Integer> hashSet = new HashSet<>();
    for(int num:nums){
        hashSet.add(num);
    }
    for(int num:nums){
        if(!hashSet.contains(num-1)){
            int count = 1;
            int x=num;
            while(hashSet.contains(x+1)){
                x++;
                count++;
            }
            longest = Math.max(longest,count);
        }
    }
    return longest;
    }

    public static void main(String[] args) {
        int[] input = {100,4,200,1,3,2};
        System.out.println(new LongestConsecutiveSequence().longestConsecutive(input));
    }

}
