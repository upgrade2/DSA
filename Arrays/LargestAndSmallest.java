package Arrays;

public class LargestAndSmallest {


    public static int[] minMax(int arr[]){
        int max=0,min=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[min]>arr[i+1]){
                min=i+1;
            }
            if(arr[max]<arr[i+1]){
                max=i+1;
            }
        }
        return new int[]{arr[min],arr[max]};
    }
    public static void main(String[] args) {
    int arr[] ={3, 1, 5,9, 2, 8,11};

    int result [] = minMax(arr);
    for(int i:result){
        System.out.print(STR."\{i} ");
    }
    }
}
