package bossCoder;

import com.sun.jdi.Value;

import java.util.stream.Stream;

public class CountChar {
    static int solve(String word,char c) {
       int count =0;
       for(char ch: word.toCharArray()){
           if(ch==c)count++;
       }
       return count;
    }

    static boolean check(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] c = s.toCharArray();
        int i=0,j=c.length-1;
        while(i<j){
            if(c[i]==c[j]){
                i++;
                j--;
            }
            else return false;

        }
        return true;
    }

    public static void main(String[] args) {
        String inputString="Hello World";
        char inputChar='i';
        System.out.println(solve(inputString,inputChar));
        System.out.println(check("A man, a plan, a canal: Panama"));
    }
}
