package Constructor;

class parent{
    String s="Parent class";
}
public class C4_Super_This extends parent {
    public void meth(){
        String s="Child class";

        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
    }
    public static void main(String[] args) {
       // meth();   //---> java: non-static method meth() cannot be referenced from a static context
    }
}
// so here we cannot use the super and this because the area is the staic so super and this will not work there
// so if we wants to use the super then we have to write those method in non-static area

