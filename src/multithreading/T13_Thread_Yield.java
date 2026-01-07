package multithreading;

class myThread10 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Child Thread");
            Thread.yield();   //------------->line 1
        }
    }
}
public class T13_Thread_Yield  {
    public static void main(String[] args) {
        myThread10 t=new myThread10();
        t.start();
        for (int i=0;i<5;i++){
            System.out.println("main thread");
        }
    }
}
// in the above program if we are commenting the line 1 then both the thread will execute simultaneously and we can't except
//which thread will complete first
// if we are not commenting the line 1 then child thread always calls yield method becaiuse of that
//main thread will gwt chance more number of time and the chance of completing main thread first is high
//some platform won't provide proper support for the yield method
/*main thread
main thread
main thread
main thread
Child Thread
main thread
Child Thread
Child Thread
Child Thread
Child Thread*/