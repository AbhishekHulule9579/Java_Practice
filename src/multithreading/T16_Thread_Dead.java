package multithreading;

public class T16_Thread_Dead {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
    }
}
