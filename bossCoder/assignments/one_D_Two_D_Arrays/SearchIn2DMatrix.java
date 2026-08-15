package bossCoder.assignments.one_D_Two_D_Arrays;

import java.util.List;

public class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target){
        int rows = matrix.length,col=matrix[0].length;
        int low=0,high=rows-1;
        while (low<=high){
            if(target==matrix[low][high])return true;
            else if (target<matrix[low][high]) {
                //move left
                high--;
            }
            else
                //move right
                low++;
        }

        return false;
    }

    //BossCoder Assignment with Binary Search
    static boolean solve(List<List<Integer>>  input, int target){
        int n = input.size();
        int m = input.get(0).size();
        int low =0;
        int high = n*m-1;
        while(low<=high){
            //find mid point
            int mid = low + (high-low)/2;
            //convert mid -> row col codinates
            int row = mid / m;
            int col = mid % m;
            int value = input.get(row).get(col);
            if(value==target)return true;
            else if (value>target) {
                high = mid -1;
            }
            else low = mid + 1;
        }
        return false;
    }
}
