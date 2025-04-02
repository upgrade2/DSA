package stack;

import java.util.Stack;

public class RemoveAdjacentElement {

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c:s.toCharArray()){
            if(!stack.isEmpty()&&stack.peek()==c){
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }
        StringBuilder  result = new StringBuilder();
        for(char c : stack){
        result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s ="abbaca";

        s = removeDuplicates(s);

        System.out.println("Result : "+s);
    }
}
