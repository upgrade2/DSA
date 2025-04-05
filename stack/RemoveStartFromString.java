package stack;

import java.util.Stack;

public class RemoveStartFromString {

    public static String removeStars(String s) {

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char c :s.toCharArray()){
            if(c!='*'){
                stack.push(c);
            }
            else {
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }

        for(char c :stack){
            result.append(c);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
}
