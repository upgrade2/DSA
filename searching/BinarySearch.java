package searching;

public class BinarySearch {

    public static int search(int[] nums, int target) {

        int left=0,right=nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){right=mid-1;}
            else {left = mid+1;}
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[]={-1,0,3,5,9,12};
        int target = 5;
       System.out.print("Result: "+search(nums,target));
    }
}
