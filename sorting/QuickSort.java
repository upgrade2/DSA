package sorting;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int nums[],int low, int high){

        int pivot= nums[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(nums[j]<pivot) {
                //swap
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        i++;
        int temp = nums[i];
        nums[i]=pivot;
        nums[high]=temp;

    return i;
    }


    public static void quickSort(int nums[],int low,int high){
        if(low<high){
            int pidx= partition(nums,low,high);
          //  System.out.println("pidx :"+pidx);
            quickSort(nums,low,pidx-1);
            quickSort(nums,pidx+1,high);
        }

    }
    public static void main(String[] args) {
        int nums[]={6,3,9,5,2,8};
      //  quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
