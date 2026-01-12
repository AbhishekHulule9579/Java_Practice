package multithreading;

class Display{
    public synchronized void wish(String name) {
        int x = 10;
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(name);
        }
    }
}

class myThread14 extends Thread{
    Display d;
    String name;
    myThread14(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}

public class T20_Thread_Synchronization {
    public static void main(String[] args) {
        Display d=new Display();
        myThread14 t=new myThread14(d,"dhoni");
        myThread14 t1=new myThread14(d,"Hardik Pandya");
        t.start();
        t1.start();
    }
}
/*
if we are not declaring wish method as synchronized then both thread will be executed simultaneouslly and hence
we will get irregular output -->
Good Morning: Good Morning: Hardik Pandya
Good Morning: dhoni
Good Morning: Hardik Pandya
Good Morning: dhoni
Good Morning: Hardik Pandya
Good Morning: dhoni
Good Morning: Hardik Pandya
Good Morning: dhoni

this is irregular output

if we declare wish method as synchronized then at a time only one thread is allowed to execute wish method on the give
display object hence we will get regular output -->
Good Morning: dhoni
Good Morning: dhoni
Good Morning: dhoni
Good Morning: dhoni
Good Morning: dhoni
Good Morning: dhoni
Good Morning: dhoni
Good Morning: dhoni
Good Morning: dhoni
Good Morning: dhoni
Good Morning: Hardik Pandya
Good Morning: Hardik Pandya
Good Morning: Hardik Pandya
Good Morning: Hardik Pandya
* */