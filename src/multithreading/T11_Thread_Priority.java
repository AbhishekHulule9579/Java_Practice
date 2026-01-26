package multithreading;

class myThread5 extends Thread{
}
public class T11_Thread_Priority {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(8);  //--------------->8,8
        //Thread.currentThread();         ---------->5,5
        System.out.println(Thread.currentThread().getPriority());
        myThread5 t=new myThread5();
        System.out.println(t.getPriority());
    }
}
