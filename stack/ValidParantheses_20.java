package stack;

import java.util.Stack;

public class ValidParantheses_20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(Character c:s.toCharArray()){
            if(c.equals('(') || c.equals('{') ||c.equals('[')){
                stack.push(c);
            }
            else{
               if(stack.empty()){
                 return false;
               }
               else {
                  char top= stack.pop();
                  if(c==')' && top!='(')return false;
                  if(c==']' && top!='[')return false;
                  if(c=='}' && top!='{')return false;
               }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()[]{}"; //"()";
        System.out.print("Valid Parantheses : "+isValid(s));
    }
}
