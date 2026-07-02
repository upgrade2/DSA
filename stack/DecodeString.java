package stack;

import java.sql.PreparedStatement;
import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s) {

        Stack<Integer> number = new Stack<>();
        Stack<String> character = new Stack<>();
        String result="";
        int index=0;
        while(index<s.length()){
        if(Character.isDigit(s.charAt(index))){
            int count =0;
            while (Character.isDigit(s.charAt(index))) {
                count = 10 * count + (s.charAt(index) - '0');
                index++;
            }
            number.push(count);

        } else if (s.charAt(index)=='[') {
            character.push(result);
            result="";
            index++;
        }
        else if (s.charAt(index)==']') {
        StringBuilder temp = new StringBuilder(character.pop());
        int count = number.pop();
        for(int i=0;i<count;i++){
            temp.append(result);
        }
        result = temp.toString();
        index++;
        }
        else{
            result +=s.charAt(index);
            index++;
        }
        }
        return result;
    }

    public static void main(String[] args) {

        String temp="3[a]2[bc]";
        System.out.println("Result :"+decodeString(temp));
    }
}
