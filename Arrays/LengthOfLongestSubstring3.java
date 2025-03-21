package Arrays;

import java.util.HashSet;

public class LengthOfLongestSubstring3 {

    public static int lengthOfLongestSubstring(String s) {

        int i=0,j=0,max=0;

        HashSet<Character> set = new HashSet<>();

        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max = Math.max(set.size(), max);
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        String s = "abcabdcbb";
        System.out.print("Result:: "+lengthOfLongestSubstring(s));
    }
}
