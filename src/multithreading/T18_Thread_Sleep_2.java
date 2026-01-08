package multithreading;

class myThread12 extends Thread{
    public void run(){
        try{
            for (int i=0;i<10;i++){
                System.out.println("I am lazy Thread");
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e){
            System.out.println("I am Interrupted Exception");
        }
    }
}

public class T18_Thread_Sleep_2 {
    public static void main(String[] args) {
        myThread12 t=new myThread12();
        t.start();
        t.interrupt();     // ------>line 1
        System.out.println("End of the main Thread");
    }
}

/*
if we comment line 1 then main thread won't interrupt child thread in this case child thread will execute for loop
10 times
if we are not commenting  line 1 then main thread interrupts child thread in this case output is -->
--->End of the main Thread
I am lazy Thread
I am Interrupted Exception

*/

