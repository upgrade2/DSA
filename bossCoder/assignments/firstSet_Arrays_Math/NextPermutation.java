package bossCoder.assignments.firstSet_Arrays_Math;

public class NextPermutation {
    public static int[] build(int[]  input){
        int n = input.length;
        int ind = -1;
        //find the break point
        for(int i=n-2;i>=0;i--){
            if(input[i]<input[i+1]){
                ind = i;
                break;
            }
        }
        if(ind==-1) return reverse(input,0,n-1);
        //find just greater element and swap it.
        for(int i=n-1;i>=ind;i--){
            if(input[i]>input[ind]){
                swap(input,i,ind);
                break;
            }
        }

        reverse(input,ind+1,n-1);
        return input;
    }

    private static int[] reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    private static void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public static void main(String[] args) {
        int[] input ={1,2,3,4,5};
        //int[] input = {5,4,3,2,1};
        int[] result = build(input);
        for(int i:result){
            System.out.print(i+" ");
        }

    }
}
