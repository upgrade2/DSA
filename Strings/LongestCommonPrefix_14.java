package Strings;
import java.util.Arrays;
public class LongestCommonPrefix_14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs==null)return "";
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
       // if(str1.length()==0||str2.length()==0)return "";
        int index = 0;
        while(index< Math.min(str1.length(),str2.length())){
        if(str1.charAt(index)==str2.charAt(index)){
        index++;
        }else break;
        }
        return str2.substring(0,index);
    }

    public static void main(String[] args) {
        //String strs[] = {"flower","flow","flig"};
        String strs[] ={  "","b"};
        System.out.println("Result : "+longestCommonPrefix(strs));
    }
}
