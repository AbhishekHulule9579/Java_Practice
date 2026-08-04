package Constructor;
class Test3{
    Test3(double n){
        this(10);
        System.out.println("Double");
    }
    Test3(int n){
        this();
        System.out.println("integer");
    }
    Test3(){
        System.out.println("No-args constructor");
    }
}
public class C5_Constructor_Overloading {
    public static void main(String[] args) {
        Test3 t=new Test3(10.5);
        /*
        No-args constructor
        integer
        Double
         */
        Test3 t2=new Test3(10);
        /*
        No-args constructor
        integer
         */
        Test3 t3=new Test3();
        /*
        No-args constructor
         */
    }
}
