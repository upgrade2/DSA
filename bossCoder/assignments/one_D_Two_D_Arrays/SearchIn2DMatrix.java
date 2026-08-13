package bossCoder.assignments.one_D_Two_D_Arrays;

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
}
