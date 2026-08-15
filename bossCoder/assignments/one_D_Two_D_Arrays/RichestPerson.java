package bossCoder.assignments.one_D_Two_D_Arrays;

import java.util.ArrayList;
import java.util.List;

public class RichestPerson {
    static int solve(List<List<Integer>>  input){
    int result=Integer.MIN_VALUE;
    int n= input.size();
    int m= input.get(0).size();
    for(int i=0;i<n;i++){
        int sum=0;
        for(int j=0;j<m;j++){
            sum += input.get(i).get(j);
        }
        result = Math.max(sum,result);
    }

    return result;
    }
}
