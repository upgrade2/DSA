package hashMapOrHashSet;

import java.sql.SQLOutput;
import java.util.HashSet;

public class EqualRowColumnPairs {
    public int equalPairs(int[][] grid) {

        HashSet<String> rowSet = new HashSet<>();
        HashSet<String> colSet = new HashSet<>();

        for(int i)

        return 0;
    }
    public static void main(String[] args) {
        int[][] nums = {{3,2,1},{1,7,6},{2,7,7}};

        EqualRowColumnPairs obj = new EqualRowColumnPairs();
        System.out.println("Result:"+obj.equalPairs(nums));

    }
}
