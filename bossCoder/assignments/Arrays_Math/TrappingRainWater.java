package bossCoder.assignments.Arrays_Math;

public class TrappingRainWater {

    static int trap(int[]  arr){
    int lMax =0 ,rMax =0, total=0;
    int l=0 , r = arr.length-1;

    while(l<r){
    if(arr[l]<arr[r]){
        if(lMax>arr[l])total += lMax - arr[l];
        else lMax = arr[l];
        l++;
    }
    else{
        if(rMax>arr[r]) total += rMax-arr[r];
        else rMax = arr[r];
        r--;
    }
    }
    return total;
    }

    public static void main(String[] args) {
        int[] input ={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(input));
    }
}
