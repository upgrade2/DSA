package bossCoder.assignments.Arrays_Math;

import java.util.ArrayList;
import java.util.List;

public class MatrixDaigonalSum {
    static int solve(List<List<Integer>>  input){
        int sum = 0;
        int n = input.size();
        for(int i=0; i<n; i++){
            sum += input.get(i).get(i);
            sum += input.get(i).get(n-i-1);
        }
        if(n%2 !=0){
            sum -= input.get(n/2).get(n/2);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        List<List<Integer>> input = new ArrayList<>();
        for(int[] row: mat){
            List<Integer> innerList = new ArrayList<>();
            for(int v:row){
                innerList.add(v);
            }
            input.add(innerList);
        }

        System.out.println(solve(input));
    }
}
