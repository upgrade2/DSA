package stack;

import java.util.Stack;

public class LargestRectangleArea {

    static int largestRectangleArea(int[] heights){
        int maxArea=0;
        Stack<int[]> stack = new Stack<>();

        for(int i=0;i<heights.length;i++){
            int start =i;
            while(!stack.empty() && stack.peek()[1]>heights[i]){
                int[] top = stack.pop();
                int height = top[1];
                int index = top[0];
                maxArea = Math.max(maxArea,height*(i-index));
                start = index;
            }
            stack.push(new int[]{start,heights[i]});

        }
        for(int[] pair:stack){
            int height = pair[1];
            int index = pair[0];
            maxArea = Math.max(maxArea,height*(heights.length-index));
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] input={7,1,7,2,2,4};
        System.out.println("Max Area: "+largestRectangleArea(input));
    }

}
