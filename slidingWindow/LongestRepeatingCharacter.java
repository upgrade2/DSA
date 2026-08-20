package slidingWindow;

public class LongestRepeatingCharacter{
    public int characterReplacement(String s, int k) {
    char[] chars =s.toCharArray();
    int maxLen=0,maxFreq=0;
    int l=0 ,r=0;
    int[] hash = new int[26];
    while(r<chars.length){
    hash[chars[r]-'A']++;
    maxFreq = Math.max(maxFreq,hash[chars[r]-'A']);
    if((r-l+1)-maxFreq>k){
        hash[chars[l]-'A']--;
        l=l+1;
    }
    if((r-l+1)-maxFreq<=k){
        maxLen = Math.max(maxLen,r-l+1);
    }
    r++;
    }
    return maxLen;
    }
}
