package hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnograms {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0)return new ArrayList<>();

        Map<String,List<String>> anagramMap=new HashMap<>();
        for (String word : strs) {

            String frequency = getFrequency(word);

            if(anagramMap.containsKey(frequency)){
                anagramMap.get(frequency).add(word);
            }
            else{
                List<String> newList = new ArrayList<>();
                newList.add(word);
                anagramMap.put(frequency,newList);
            }
        }

        return new ArrayList<>(anagramMap.values());
    }
private static String getFrequency(String str){
        int[] freq = new int[26];

        for(char c :str.toCharArray()){
            freq[c-'a']++;
        }

        StringBuilder freqString = new StringBuilder();
        char c='a';
        for(int i : freq){
            freqString.append(c);
            freqString.append(i);
            c++;
        }

        return freqString.toString();
}
    public static void main(String[] args) {
    String strs[] = {"eat","tea","tan","ate","nat","bat"};

    List<List<String>> result = null;

    result = groupAnagrams(strs);

        result.forEach(innerList -> {
            innerList.forEach(item -> System.out.print(item + " "));
            System.out.println();
        });


    }

}
