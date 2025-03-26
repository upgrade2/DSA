package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MergeSortedArrays_88 {
    public  void merge(int[] nums1, int m, int[] nums2, int n) {

        int last = m+n-1;

        while(m>0&&n>0){
            if(nums1[m-1]>nums2[n-1]){
                nums1[last] = nums1[m-1];
                m--;
            }
            else {
                nums1[last] = nums2[n-1];
                n--;
            }
            last--;
        }
        while (n>0)
            nums1[last]=nums2[n-1];
        n--;
        last--;
    }
    public static void main(String[] args) {
        MergeSortedArrays_88 ms = new MergeSortedArrays_88();
        int[] nums1 ={1,2,3,0,0,0}, nums2={2,5,6};

        ms.merge(nums1,3,nums2,3);

        for(int i:nums1)
        System.out.print(i+" ");
    }
}
