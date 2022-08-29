package Test_Night_025;

import MyLibrary.Library;



    //Static variables
        //
//  When a variable is declared as static, then a single copy of variable is created
//  and shared among all objects at class level. Static variables are, essentially, global variables.
//  All instances of the class share the same static variable.
//
//  We can create static variables at class-level only.
//  static: class member, can be called through the class
//  there is only one copy of static shared by all objects
//
//            prefers to be called through class name
//
//            static ONLY accepts static
//
//
//    static members:
//            1. static variable (global variables)
//            2. static methods
//            3. static initializer block
//            4. static nested class
//

//static variable: declared outside any block with static keyword

//Instance: every single object of the class has its own copy
//
//local variable: variables that are declared in a block
//
//instance variables: declared outside the blocks
//
//
    // blocks means inside class what ever has {} (such as methods)
public class StaticVariable {

    int number1 = 25; //instance variable
    int number2 = 0; //instance variable

    //static variable: declared outside any block with static keyword
    static int i1 = -20;//static variable


    public static void main(String[] args) {

        System.out.println(i1);//-20
        //for static variable you don't need to create an object from class to be able to call them

        StaticVariable object3 = new StaticVariable();
        object3.i1 = 20;
        System.out.println(i1); //20
        StaticVariable object4 = new StaticVariable();
        object4.i1 = 55;
        System.out.println(i1); //55

        Library.stars();
        System.out.println(object3.i1); //55
        System.out.println(object4.i1); //55
        System.out.println(i1);//55

        Library.stars();

        int number3 = 200; //local variable
        //to be static it needs to have static keyword   no
        //instance variable declared outside the blocks  no

        System.out.println(number3);//200

        //System.out.println(number2);
        //to be able to print my instance variable i need to create an object from class
        StaticVariable object1 = new StaticVariable();
        System.out.println(object1.number1);//25
        object1.number1 = 35;
        object1.number2 = 50;
        System.out.println(object1.number1);//35

        //instance variables can have multiple copy from class
        StaticVariable object2 = new StaticVariable();
        object2.number1 = 150;

        Library.stars();
        System.out.println(object1.number1); //35
        System.out.println(object2.number1); //150
        // System.out.println(number1); error


    }

    {
        //block
    }


}

