package Constructor;

public class C7_Recursive_Method {
    public static void m1(){
        m2();
    }
    public static void m2(){
        m1();
    }
    public static void main(String[] args) {

        m1();
        System.out.println("Hello");
    }
}
// this will not work and give us error