package arrays;

public class CanPlaceFlower {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int max=0,fi=-1,li=-1;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0)continue;

            else if(fi==-1){
                fi=i;
                li=i;
            }
            else{
                li=i;
            }
        }

        if(fi==-1){
            max = (flowerbed.length+1)/2;
        }
        else{
            int left=fi;
            int right=flowerbed.length - 1 - li;

            max = left/2;
            max += right/2;

            int count=0;
            for(int i=fi+1;i<=li-1;i++){
                if(flowerbed[i]==0)
                {count++;}
                else{
                    max += (count-1)/2;
                    count = 0;
                }
            }
            max += (count-1)/2;
        }
        return n<=max;
    }

    public static void main(String[] args) {
        int[] nums ={1,0,0,0,1};

        System.out.println("Result:"+canPlaceFlowers(nums,1));
    }
}
