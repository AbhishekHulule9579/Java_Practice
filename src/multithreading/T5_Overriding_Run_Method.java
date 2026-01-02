package multithreading;
class mythread2 extends Thread{
    public void start(){
        System.out.println("Start method");
    }
    public void run(){
        System.out.println("run method ");
    }
}
public class T5_Overriding_Run_Method {
    public static void main(String[] args) {
        mythread2 th=new mythread2();
        th.start();
        System.out.println("main method");
    }
}
// case 5
//output
/*Start method
main method*/