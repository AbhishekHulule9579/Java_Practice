package multithreading;

class T1_extends_Thread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child Thread");
            //executed by the child thread
        }
        //job of the thread
    }
}
