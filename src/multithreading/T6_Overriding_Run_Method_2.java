package multithreading;
class mythread3 extends Thread{
    public void start(){
        super.start();
        System.out.println("Start method");
    }
    public void run(){
        System.out.println("run method ");
    }
}
public class T6_Overriding_Run_Method_2 {
    public static void main(String[] args) {
        mythread3 th=new mythread3();
        th.start();
        System.out.println("main method");
    }
}
// case 5
//output
/*
**********there are 3 possible output of the above program they are
* 1)
Start method
run method
main method
2)
run method
start method
main method
*
3)
main method
start method
run method
*/