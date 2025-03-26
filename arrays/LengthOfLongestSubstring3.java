package arrays;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring3 {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int i = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                // Update start of window to new position
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
            map.put(s.charAt(j), j);
            maxLength = Math.max(maxLength, j - i + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabdcbb";
        System.out.print("Result:: "+lengthOfLongestSubstring(s));
    }
}
