package hashMapOrHashSet;

import java.util.Arrays;

public class DetermineTwoStringsAreClosed {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0;i<word1.length();i++){
            freq1[word1.charAt(i)-'a']++;
            freq2[word2.charAt(i)-'a']++;
        }

        for(int i=0;i<word1.length();i++){
            if(freq1[i]>0 && !(freq2[i]>0))return false;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1,freq2);
    }

    public static void main(String[] args) {
        String world1="abcdefgggg";
        String world2="abcdefgggg";
        DetermineTwoStringsAreClosed obj = new DetermineTwoStringsAreClosed();
        System.out.println("Result:"+obj.closeStrings(world1,world2));
    }
}
