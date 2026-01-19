package multithreading;

class Display1{
    public synchronized void dispaly(){
        for(int i=0;i<=10;i++){
            System.out.print(i);
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
        }

        }
    }

    public synchronized void dispalyc(){
        for(int i=65;i<=75;i++){
            System.out.print((char) i);
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
        }
        }
    }
}

class myThread16 extends Thread{
    Display1 d;
    myThread16(Display1 d){
        this.d=d;
    }
    public void run(){
        d.dispaly();
    }
}

class myThread17 extends Thread{
    Display1 d;
    myThread17(Display1 d){
        this.d=d;
    }
    public void run(){
        d.dispalyc();
    }
}
public class T22_Thread_Synchronization_3 {
    public static void main(String[] args) {
        Display1 d=new Display1();
        myThread16 t1=new myThread16(d);
        myThread17 t2=new myThread17(d);
        t1.start();
        t2.start();
    }

}
/*

* */