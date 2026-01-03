package multithreading;

class myRunnable implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}
public class T8_MyRunnable_Interface {
    public static void main(String[] args) {
        myRunnable r=new myRunnable();
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("**");
        }
    }
}
