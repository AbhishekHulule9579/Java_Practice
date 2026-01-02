package multithreading;
class Mythread1 extends Thread{

}

public class T4_Not_Overriding_run_Method {
    public static void main(String[] args) {
        Mythread1 t=new Mythread1();
        t.start();
    }
}
//No output
//Case 5