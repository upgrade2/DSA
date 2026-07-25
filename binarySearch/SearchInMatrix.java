package binarySearch;

public class SearchInMatrix {

    static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length , m = matrix[0].length;
        int low=0 , high= (n*m)-1;
        while(low<=high){
            int mid = (low+high)/2;
            int row = mid/m,col=mid%m;
            if(matrix[row][col]==target)return true;
            else if (matrix[row][col]<target) {
                low = mid+1;
            }
            else high=mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        int target=2;
        System.out.println("Result: "+searchMatrix(matrix,target));
    }
}
