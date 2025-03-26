package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArrays_88 {
    public  void merge(int[] nums1, int m, int[] nums2, int n) {

       for(int i=0;i<n;i++){
           nums1[m+i]=nums2[i];
       }
       Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        MergeSortedArrays_88 ms = new MergeSortedArrays_88();
        int[] nums1 ={1,2,3,0,0,0}, nums2={2,5,6};

        ms.merge(nums1,3,nums2,3);

        for(int i:nums1)
        System.out.print(i+" ");
    }
}
