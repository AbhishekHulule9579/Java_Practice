package multithreading;

class myRunnable1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}

public class T9_Third_Approach {
            public static void main(String[] args) {
            myRunnable1 r=new myRunnable1();
            Thread t=new Thread(r);
            t.start();
            System.out.println("**");
        }

}
