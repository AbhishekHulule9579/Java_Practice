package multithreading;

class myThread11 extends Thread{
    static Thread mt;
    public void run(){
        try{
            mt.join();
        }
        catch (InterruptedException e){}
            for (int i=0;i<10;i++){
                System.out.println("Child Thread");
            }

    }
}
public class T15_Thread_Join_Demo {
    public static void main(String[] args) throws InterruptedException {
        myThread11.mt=Thread.currentThread();
        myThread11 t=new myThread11();
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }
    }
}
/*
in the above examples child threads calls the join method on main thread objects hence child thread has to wait
until completing main thread
in this case output is --->
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
*/