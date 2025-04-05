package stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public  int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for(String token:tokens){
            if(isOperator(token)){
                int n2 = Integer.parseInt(stack.pop());
                int n1 = Integer.parseInt(stack.pop());
                int result=0;

                if(token=="+"){
                    result = n1+n2;
                }
                else if(token=="-"){
                    result = n1-n2;
                }
                else if(token=="*"){
                    result = n1*n2;
                }
                else if(token=="/"){
                    result = n1/n2;
                }
                stack.push(Integer.toString(result));
            }else{
                stack.push(token);
            }
        }

        return Integer.parseInt(stack.peek());
    }
    private  boolean isOperator(String str){
        if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/"))return true;
        return false;
    }
    public static void main(String[] args) {
        String[] strings =  {"4","13","5","/","+"}; //{"2","1","+","3","*"};

        System.out.println(new EvaluateReversePolishNotation().evalRPN(strings));
    }
}
