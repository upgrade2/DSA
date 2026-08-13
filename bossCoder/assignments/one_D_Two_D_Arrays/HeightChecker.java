package bossCoder.assignments.one_D_Two_D_Arrays;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int count=0;
        int n=heights.length;
        int[] expected = heights.clone();
        Arrays.sort(expected);
        for(int i=0;i<n;i++){
            if(expected[i]!=heights[i])count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] input ={1,1,4,2,1,3};
        System.out.println(heightChecker(input));
    }
}
