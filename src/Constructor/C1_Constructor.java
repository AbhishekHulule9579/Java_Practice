package Constructor;
class Student{
     int id;
     String name;

    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }     // ---------------------- this is the constructor
}
public class C1_Constructor {
    public static void main(String[] args) {
        Student s1=new Student(1,"Abhishek");  // <----- and here we initialize it
        Student s2=new Student(2,"Omkar");

        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}
