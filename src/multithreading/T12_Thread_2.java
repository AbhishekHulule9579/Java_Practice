package multithreading;

class myThread9 extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("child thread");
        }
    }
}
public class T12_Thread_2 {
    public static void main(String[] args) {
        myThread9 t=new myThread9();
        t.setPriority(10);
        t.start();
        for (int i=0;i<5;i++){
            System.out.println("main thread");
        }
    }
}
// some platform won't provide proper support for thread priority