package stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        stack = new Stack();
        minStack = new Stack();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()||val<=minStack.peek())
            minStack.push(val);
    }

    public void pop() {
        int poppedValue = stack.pop();

        if(poppedValue == minStack.peek())
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return  minStack.peek();
    }
}


