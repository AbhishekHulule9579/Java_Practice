package multithreading;
class Mythread extends Thread{
    public void run(){
        System.out.println("no args constructor");
    }   //only this method is callled in this code and not ht e below thread is called
    public void run(int i){
        System.out.println("int args constructor");
    }
}

// Case 4
/* overloading of run method is always possible but thread class start method can invoke no-argument run method
the other overloaded method we have call explicity like a normal method call  */


class T3_No_Thread_Calling {
    public static void main(String[] args) {
        Mythread t=new Mythread();
        t.start();

        // in this method only this first run "no args constuctor is called and not another
        // int
        // args contructor is called
    }
}
