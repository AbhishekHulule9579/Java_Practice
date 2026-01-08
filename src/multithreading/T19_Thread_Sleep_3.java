package multithreading;

class myThread13 extends Thread{
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println("I am lazy Thread "+ i);
        }
        System.out.println("I am entering into the sleeping state");
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            System.out.println("I got interrupted");
        }
    }
}
public class T19_Thread_Sleep_3 {
    public static void main(String[] args) {
        myThread13  t=new myThread13();
        t.start();
        t.interrupt();
        System.out.println("End of the main thread");
    }
}
//notes5

/*
in the above example interrupt call waited until child thread complete for loop 1000 times
* */