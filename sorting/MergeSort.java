package sorting;

public class MergeSort {
    //Merge two sorted arrays
    static int[] mergeSort(int[] arr1,int[] arr2){
        int length = arr1.length+arr2.length;
        int[] result = new int[length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j< arr2.length){
        if(arr1[i]<arr2[j])result[k++]=arr1[i++];
        else result[k++] = arr2[j++];
        }
        while(i < arr1.length){
            result[k++]=arr1[i++];
        }
        while(j < arr2.length){
            result[k++] = arr2[j++];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,7,9} ,arr2 ={3,6,8,10};
        int[] result = mergeSort(arr1,arr2);
        for(int i:result){
        System.out.print(i+" ,");
        }
    }
}
