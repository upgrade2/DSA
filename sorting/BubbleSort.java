package sorting;

import java.util.Arrays;

public class BubbleSort {


    public static void bubbleSort(int numbs[]){
        int n = numbs.length;
        boolean swapped;
        int iteration=0;
        for(int i=0; i<n-1; i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(numbs[j]>numbs[j+1]){

                    int temp=numbs[j];
                    numbs[j]=numbs[j+1];
                    numbs[j+1]=temp;
                    swapped=true;
                }
            iteration++;
                System.out.println(STR."Iteration:\{iteration}");
            }if (!swapped){
System.out.println(STR."Iteration:\{iteration}");
            }break;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
