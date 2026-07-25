package binarySearch;

import java.util.Arrays;

public class BinarySearch {

    static int binarySearch(int[] nums,int target){
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(target==nums[mid])return mid;
            else if(target>nums[mid]) l=mid+1;
            else r=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
    int[] input = {0,1,2,3,4,5,6,7,8,9,10};
    int target=1;
        System.out.println( "Index: "+binarySearch(input,target));
    }
}