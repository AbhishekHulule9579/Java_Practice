package Interfaces;

interface inter{
    public void m1();
    public void m2();
}
abstract class I1_Interface_Declaration implements inter{

    //we are declaring the class as "abstract" because we haven't declare
    // the method m2() of interface in the class

    public void m1(){

    }
}
/*
public class I1_Interface_Declaration implements inter{

    //we are declaring the class as "abstract" because we haven't declare
    // the method m2() of interface in the class

    public void m1(){
    }
    public void m2(){
    }
 */



/*
* “In Java, an interface is a service requirement specification.”

“An interface in Java specifies the services a class must provide.”

“A Java interface acts as a contract that defines service requirements.”

"An interface in Java is a contract that defines a
 set of method declarations that implementing classes must provide."

* Everytime if we are imlementing the method of the interface then we have
* declare method it as public in the subclass
*
* if you are unable to provide the implementation to any of the method in the subclass
* then you have to declare the subclass as the abstract
*
*
* Think of a Mobile Charger Specification 🔌

The specification says:

Voltage must be 5V

Current must be 2A

It does not say how the charger is built

That specification is like a Java interface.

Different companies (Samsung, Apple, etc.) make chargers

Each charger follows the same specification

But the internal implementation differs

👉 Interface = Service requirement / specification
👉 Class = Actual service provider
* * */
