package extras;

class A{

    static int x=10;
    int y=1;

void  method(){
    y++;
    x++;    
    System.out.println(x +" "+ y);

}
    public static void main(String[] args){
 
        A a1= new A();
        A a2 = new A();
        A a3 = new A();

        a1.method();  
        a3.method();  
        a2.method(); 
    }
}