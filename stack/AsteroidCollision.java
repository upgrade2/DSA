package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] a) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i:a){
            if(i>0)stack.push(i);
            else{
             while(!stack.isEmpty()&&stack.peek()>0&&stack.peek()<-i){
                 stack.pop();
             }
             if(stack.isEmpty()||stack.peek()<0){
                 stack.push(i);
             }
             else if (stack.peek()==-i){
                 stack.pop();
             }
            }
        }

        int[] result = new int[stack.size()];

        for(int i=stack.size()-1;i>=0;i--){
            result[i]=stack.pop();
        }
        return result;
    }
    public static void main(String[] args) {
    int[] nums={5,10,-5};
    for(int i:asteroidCollision(nums)){
        System.out.print(" "+i);
    }

    }
}
