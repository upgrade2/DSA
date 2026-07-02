package arrays;

import java.util.*;

public class GroupAnagrams {
    private List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return Collections.singletonList(new ArrayList<String>());
        }
        Map<String,List<String>> freqHm = new HashMap<>();
        for(String str:strs){
            String key = getFrequencyKey(str);
            if(freqHm.containsKey(key)){
                freqHm.get(key).add(str);
            }
            else{
                List<String> listStr = new ArrayList<>();
                listStr.add(str);
                freqHm.put(key,listStr);
            }
        }

        return new ArrayList<>(freqHm.values());
    }

    private String getFrequencyKey(String str){
        int[] freqArray = new int[26];
        for(char c:str.toCharArray()){
            freqArray[c-'a']++;
        }
        char c='a';
        StringBuilder freqKey = new StringBuilder();
        for(int i:freqArray){
            freqKey.append(c);
            freqKey.append(i);
            c++;
        }
        return freqKey.toString();
    }
    public static void main(String[] args) {
        String[] input ={"act","pots","tops","cat","stop","hat"};
        System.out.println(new GroupAnagrams().groupAnagrams(input));
    }

}
