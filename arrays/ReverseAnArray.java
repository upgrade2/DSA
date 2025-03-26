package arrays;

public class ReverseAnArray {

    public static void swap(int arr[],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    }
    public static void reverse(int arr[]){
    int i=0,j=arr.length-1;
        while(i!=j & j>arr.length/2){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        int a[] = {2,3,4,5,7,8};
        reverse(a);

        for(int i:a){
            System.out.print(STR."\{i} ");
        }

    }
}
