package multithreading;
class mythread4 extends Thread{
    public void start(){
        super.start();
        System.out.println("Start method");
    }
    public void run(){
        System.out.println("run method ");
    }
}
public class T7_Restarting_the_same_exception_again {
    public static void main(String[] args) {
        mythread4 th=new mythread4();
        th.start();
        System.out.println("main method");
        th.start();
    }
}

/*Output
* Exception in thread "main" java.lang.IllegalThreadStateException*/