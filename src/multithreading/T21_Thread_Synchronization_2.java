package multithreading;

class Displayy {
    public static synchronized void wish(String name) {
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

class myThread15 extends Thread{
    Displayy d;
    String name;
    myThread15(Displayy d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}

public class T21_Thread_Synchronization_2 {
    public static void main(String[] args) {
        Displayy d1=new Displayy();
        Displayy d2=new Displayy();
        myThread15 t=new myThread15(d1,"dhoni");
        myThread15 t1=new myThread15(d2,"Hardik Pandya");
        t.start();
        t1.start();
    }
}
/*
case study-->Displayy d1=new Displayy();
        Displayy d2=new Displayy();
        myThread15 t=new myThread15(d1,"dhoni");
        myThread15 t1=new myThread15(d2,"Hardik Pandya");
        t.start();
        t1.start();
        ****t1 calls d1 (with dhoni)
        ****t2 calls d2 (with hardik)

 Even though wish method is synchronized we will get irregular output because thread are operating on different java
 objects

 Conclusion--> if multiple thread are operating on same java objects then synchronization is required ,if multiple thread
 are operating on multiple java object then synchronization is not required


Output -->
Good Morning: Good Morning: Hardik Pandya
Good Morning: dhoni
Good Morning: Hardik Pandya
Good Morning: dhoni
Good Morning: Hardik Pandya
Good Morning: dhoni
Good Morning: Hardik Pandya
Good Morning: dhoni
Good Morning: Hardik Pandya
Good Morning: dhoni
Good Morning: Hardik Pandya
Good Morning: dhoni
Good Morning: Hardik Pandya
Good Morning: dhoni
Good Morning: Hardik Pandya
Good Morning: dhoni
Good Morning: Hardik Pandya
Good Morning: dhoni
Good Morning: Hardik Pandya
dhoni



** Class level lock-->At every class in java has a unique lock which is also known as class level lock
** if a thread want  to execute static synchronized method then thread required class level lock .Once thread got
class level lock then it is allowed to execute any static synchronized method of that class , once
method execution completes automatically thread releases the lock
** while a thread executing static synchronized method the remaining thread are not allowed to execute any static
synchronized method of that class simultaneously, but remaining threads are allowed to execute the following method
simultaneously  -->1)normal static method
                    2)synchronized instance methods
                    3)normal instance method

ex.---->
class xxx{
    static synch m1()
    static synch m2()
    static m3()
    synch m4()
    m5()


}
* */