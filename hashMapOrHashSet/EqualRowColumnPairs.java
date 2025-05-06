package hashMapOrHashSet;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EqualRowColumnPairs {
    public int equalPairs(int[][] grid) {
        int ans=0;
        Map<String,Integer> rowHash = new HashMap<>();
        Map<String,Integer> colHash = new HashMap<>();

        for(int row[]:grid){
        StringBuilder sb = new StringBuilder();
        for(int i:row){
            sb.append(i).append("#");
        }
        rowHash.put(sb.toString(),rowHash.getOrDefault(sb.toString(),0)+1);
        }

        for(int j=0;j< grid.length;j++){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i< grid.length;i++){
                sb.append(grid[i][j]).append("#");
            }
            colHash.put(sb.toString(),colHash.getOrDefault(sb.toString(),0)+1);
        }

        for(Map.Entry<String ,Integer> entry : rowHash.entrySet()){

            String rHash = entry.getKey();
            if(colHash.containsKey(rHash)){
                ans += rowHash.get(rHash)*colHash.get(rHash);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] nums = {{3,2,1},{1,7,6},{2,7,7}};

        EqualRowColumnPairs obj = new EqualRowColumnPairs();
        System.out.println("Result:"+obj.equalPairs(nums));

    }
}
