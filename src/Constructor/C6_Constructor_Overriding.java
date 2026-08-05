package Constructor;

class P{
    P(){

    }
}
class C extends P{
    C(int i){

    }
}
public class C6_Constructor_Overriding {
    public static void main(String[] args) {
        C c=new C(1);
    }
}
// inheritance and overriding is not applicable for the constructor