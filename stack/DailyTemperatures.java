package stack;

import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for(int i=0;i<temperatures.length;i++){
            int t = temperatures[i];
            while(!stack.empty() && t>stack.peek()[0]){
            int[] pair = stack.pop();
            result[pair[1]] = i-pair[1];
            }
            stack.push(new int[]{t,i});
        }

        return result;
    }
    public static void main(String[] args) {
    int[] input = {73, 74, 75, 71, 69, 72, 76, 73};
    int[] result = new DailyTemperatures().dailyTemperatures(input);
    for(int i:result)
    System.out.print(i+" ");
    }

//    1,4,1,2,1,0,0 output

}
