package multithreading;

class myRunnable implements Runnable{  // defining the thread
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }  //job of the thread
        //executed by the child thread
    }
}
public class T8_MyRunnable_Interface {
    public static void main(String[] args) {
        myRunnable r=new myRunnable();
        Thread t=new Thread(r);   //r is the target of the thread
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("**");
        }  //executed by the min thread
    }
}
//after compeleting this code we will get mixed output and we can't tell exact output .