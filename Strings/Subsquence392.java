package Strings;

public class Subsquence392 {
    public static boolean isSubsequence(String s, String t) {
        int i = 0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";

        System.out.println("Result:"+isSubsequence(s,t));
    }
}
