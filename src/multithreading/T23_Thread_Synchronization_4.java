package multithreading;

class Display12{
    public void wish(String name) {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Good morning");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                System.out.print(name);
            }
        }
    }
}
class myThread18 extends Thread{
    Display12 d;
    String name;
    myThread18(Display12 d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}

public class T23_Thread_Synchronization_4 {
    public static void main(String[] args) {
        Display12 d=new Display12();
        myThread18 t1=new myThread18(d,"Dhoni");
        myThread18 t2=new myThread18(d,"Hardik");
        t1.start();
        t2.start();
    }
}
