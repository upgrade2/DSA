package StarPatterns;

public class TrianglePattern {

    public static void main(String[] args) {
        System.out.println("\n--------Right Hand Side------------ \n");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("\n---------Reverse Right Hand Side-----------\n");
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("\n---------Equilateral Side-----------\n");

        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int z=i;z>0;z--)
            System.out.print("* ");
            System.out.println("");
        }
    }
}
