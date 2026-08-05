package Constructor;

public class C8_Recursive_Constructor {
    public C8_Recursive_Constructor(){
        this(10);
    }
    public C8_Recursive_Constructor(int i){
        this();
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
/*
public C8_Recursive_Constructor(){
        this(10);
    }
    public C8_Recursive_Constructor(int i){
        this();
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
here we are not calling the constructor but still the compiler will not compile this code and will give us the error
saying **** Recursive Constructor Call ****
it will not work like C7 file


 */