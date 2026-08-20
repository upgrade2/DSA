package bossCoder.assignments.firstSet_Arrays_Math;

import java.util.List;

public class SubmatrixSum {

    //Try to understand more.
    static int solve(List<List<Integer>>  input){
        int n = input.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int top_left = (i + 1) * (j + 1);
                int bottom_right = (n - i) * (n - j);
                sum += (top_left * bottom_right * input.get(i).get(j));
            }
        }

        return sum;
    }
}
