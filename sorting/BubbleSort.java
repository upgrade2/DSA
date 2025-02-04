package sorting;

import java.util.Arrays;

public class BubbleSort {


    public static void bubbleSort(int nums[]){
        int n = nums.length;
        boolean swapped;

        for(int i=0; i<n-1; i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){

                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }

                if (swapped)break;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
