package Constructor;

class Test{
    public Test() {
        System.out.println("Constructor");
    }
}

public class C2_Constructor_Execution {
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();
    }
}
