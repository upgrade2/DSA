package hashTable;

import java.util.HashMap;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
    if(s.length()!=t.length())return false;
    HashMap<Character,Character> characterHashMap = new HashMap<>();
    for(int i=0;i<s.length();i++){

        char orginalChar = s.charAt(i);
        char replacementChar = t.charAt(i);

        if(!characterHashMap.containsKey(orginalChar)){
            if(!characterHashMap.containsValue(replacementChar)){
                characterHashMap.put(orginalChar,replacementChar);
            }else return false;
        }
        else {
            char mappedChar = characterHashMap.get(orginalChar);
            if(mappedChar!=replacementChar)return false;
        }
    }
        return true;
    }
    public static void main(String[] args) {
        String s = "badc",t = "kikp";
        System.out.println("Result : "+isIsomorphic(s,t));
    }
}
