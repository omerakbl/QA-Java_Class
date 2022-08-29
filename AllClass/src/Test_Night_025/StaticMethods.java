package Test_Night_025;

//When a method is declared with static keyword, it is known as static method.
// The most common example of a static method is main( ) method.As discussed above,
// Any static member can be accessed before any objects of its class are created, and without reference to any object.
// Methods declared as static have several restrictions:
//
//They can only directly call other static methods.
//They can only directly access static data.

import MyLibrary.Library;

public class StaticMethods {

    int a = 10;             // Instance Variable
    static int b  = 20;     // Static Variable


    public static void main(String[] args) { // static method

        // System.out.println(a); // You cant call instance variable without object

        System.out.println(b); // 20
        StaticMethods object1 = new StaticMethods();
        System.out.println(object1.a); // 10

        Library.stars();

        //instanceMethod();//you cant call instance method without object
        object1.instanceMethod();//if you have object from class you can call your instance method

        MethodStatic(); // If method static no need to create object

    }

    public void instanceMethod (){ // Without static key word your method will be instance
        System.out.println(a);
        //since method is instance we don't need to create an object to be able to call instance variable
        //if method was static you would need create an object to be able to call instance variable

        System.out.println(b);//b is static variable knows as global variables

        MethodStatic();

    }
    public static void MethodStatic(){
        System.out.println("HOLA");
    }
}
