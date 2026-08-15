package bossCoder.assignments.one_D_Two_D_Arrays;

import java.util.ArrayList;
import java.util.List;

public class TransposeOfMatrix {
    static List<List<Integer>> solve(List<List<Integer>>  input){
        List<List<Integer>> result = new ArrayList<>();
        int rows = input.size();
        int cols = input.get(0).size();
        for(int i=0;i<rows;i++){
            List<Integer> innerList = new ArrayList<>();
            for(int j=0;j<cols;j++){
                innerList.add(input.get(j).get(i));
            }
            result.add(innerList);
        }
    return result;
    }
}
