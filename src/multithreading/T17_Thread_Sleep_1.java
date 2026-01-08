package multithreading;

public class T17_Thread_Sleep_1 {
    public static void main(String[] args) throws InterruptedException{
        for(int i=0;i<10;i++){
            System.out.println("Slide-"+i);
            Thread.sleep(5000);
        }
    }
}
