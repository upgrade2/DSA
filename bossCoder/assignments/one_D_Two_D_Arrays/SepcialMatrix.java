package bossCoder.assignments.one_D_Two_D_Arrays;

import java.util.List;

public class SepcialMatrix {
    static int solve(List<List<Integer>>  input){
    int n= input.size();
    int m= input.get(0).size();
    int count=0;
    int[] rows = new int[n];
    int[] cols = new int[m];

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(input.get(i).get(j)==1)
            {
                rows[i]++;
                cols[j]++;
            }
        }
    }

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(input.get(i).get(j)==1 && rows[i]==1&& cols[j]==1 )count++;
        }
    }
    return count;
    }
}
