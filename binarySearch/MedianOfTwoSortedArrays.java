package binarySearch;

public class MedianOfTwoSortedArrays {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1= nums1.length;
        int n2 = nums2.length;
        int i=0,j=0,k=0;
        int[] mergeArray=new int[n1+n2];
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]) mergeArray[k++]=nums1[i++];
            else mergeArray[k++]=nums2[j++];
        }
        while(i<n1){
            mergeArray[k++]=nums1[i++];
        }
        while(j<n2){
            mergeArray[k++]=nums2[j++];
        }
        int length = mergeArray.length;
        if(length%2==1){
            return (double)mergeArray[length/2];
        }
    return ((double)mergeArray[length/2] + (double)mergeArray[length/2-1])/2.0;
    }
    public static void main(String[] args) {
        //int[] arr1 = {1,2,3,4,5,7,9} ,arr2 ={3,6,8,10};
        int[] arr1={} , arr2 = {1};
        double result = findMedianSortedArrays(arr1,arr2);
        System.out.print("Result : "+result);
    }
}
