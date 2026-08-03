package Constructor;

class Test1{
    void Test1() {
        System.out.println("Constructor");
    }
}

public class C3_ReturnType {
    public static void main(String[] args) {
        Test1 t1=new Test1();
        Test1 t2=new Test1();
// for the above code it will not work but for the below it will work because in test class as we decalre it as void
        // then it will marked as method and not as the constructor so there will be method call
        t1.Test1();
    }
}
