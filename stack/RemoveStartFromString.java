package stack;

import java.util.Stack;

public class RemoveStartFromString {

    public static String removeStars(String s) {
        char[] result = s.toCharArray();
        int index=0;
        for(char c:result){
            if(c!='*')result[index++]=c;
            else{
                if(index>0)index--;
            }
        }
        return new String(result,0,index);
    }
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
}
