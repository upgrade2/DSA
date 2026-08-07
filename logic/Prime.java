package logic;

public class Prime {
    public static void printPrime(){
        for(int i=2;i<100;i++){
            if(i%2==0)continue;
            int count=0;
            for(int j=1;j<100;i++){
                if(i%j==0)count++;
            }
            if(count==2)System.out.println(i+" ,");
        }

    }
    public static void main(String[] args) {
        printPrime();
    }
}
