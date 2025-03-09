package sorting;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int numbs[],int low, int high){

        int pivot= numbs[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(numbs[j]<pivot) {
                //swap
                i++;
                int temp = numbs[j];
                numbs[j] = numbs[i];
                numbs[i] = temp;
            }
        }
        i++;
        int temp = numbs[i];
        numbs[i]=pivot;
        numbs[high]=temp;

    return i;
    }


    public static void quickSort(int numbs[],int low,int high){
        if(low<high){
            int partitioned= partition(numbs,low,high);
          //  System.out.println("partitioned :"+partitioned);
            quickSort(numbs,low,partitioned-1);
            quickSort(numbs,partitioned+1,high);
        }

    }
    public static void main(String[] args) {
        int numbs[]={6,3,9,5,2,8};
      //  quickSort(numbs,0,numbs.length-1);
        System.out.println(Arrays.toString(numbs));
    }
}
