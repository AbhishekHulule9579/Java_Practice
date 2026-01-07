package multithreading;

class myThread7 extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Child Thread");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){}
        }
    }
}
public class T14_Join_Thread {
    public static void main(String[] args) throws InterruptedException{
        myThread7 t=new myThread7();
        t.start();
        t.join();   //----> Line 1
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
/* If we commented line 1 then both main and child thread will be executed simultaneously and we can't expect
* exact output
*
* if we are not commenting line 1 then main thread calls child threads on thread object hence main thread will wait
* util completing child thread ,in this case output is  ===>   Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread*/