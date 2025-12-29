package multithreading;

public class T2_Child_Dema {
    public static void main(String[] args) {
        T1_extends_Thread t=new T1_extends_Thread();        //thread instantiation
        t.start();      //starting of the thread
        for (int i=0;i<5;i++){
            System.out.println("main thread");
            //executed by the main thread
        }
    }
}
/*
                    |
                    |   main thread
                  ----
                  /   \
                 /     \
             child    main

 */

/*
main thread
Child Thread
Child Thread
Child Thread
main thread
main thread
main thread
Child Thread
Child Thread
main thread
*/