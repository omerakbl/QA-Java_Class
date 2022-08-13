package Test_Night_022;

import java.util.concurrent.Callable;

public class c2_TypeCasting {
    // Type Casting
        // Autoboxing : Converting a primitive value into an object of the corresponding wrapper class is called autoboxing.
        // For example, converting int to Integer class. The java compiler applies autoboxing when a primitive value is :
                 // Passed a parameter to a method that expect an object of the corresponding wrapper class.
                 // Assigned to a variable of the corresponding wrapper class.

        // Unboxing : Converting an object of a wrapper type to its corresponding primitive value is called unboxing.
        // For example conversion of Integer to ing. The Java compiler applies inboxing when an object of wrapper class is :
                // Passed as a parameter to a method that expects a value of the corresponding primitive type.
                // Assigned to a variable of the corresponding primitive type.

    // The following table lists the primitive types and their corresponding wrapper classes,
    // which are used bt the Java compiler for autoboxing and unboxing:
    // Primitive Data Type          Wrapper Class
    // byte                         Byte
    // short                        Short
    // int                          Integer
    // long                         Long
    // float                        Float
    // double                       Double
    // boolean                      Boolean
    // char                         Character

    public static void main(String[] args) {
        // create an Integer Object
        Integer i1 =new Integer(10 );

        int i2 = i1; // unboxing :
        // Converting an object of a wrapper Integer corresponding primitive value int
        // called unboxing

        Character ch = 'w'; // Autoboxing
        // we take char='w' and assigned wrapper class

        char ch2 = ch; // unboxing
        // we took ch Wrapper Character and assign to ch2 primitive

        System.out.println(ch);
        System.out.println(ch2);

        int number = 120; // primitive

        Integer int1 = number; // autoboxing
        // if you take primitive value and assign to wrapper class that will be autoboxing

        Byte b1=25; // Wrapper Object
        // if you take wrapper object and assign to primitive that will be unboxing

        byte b2 = b1; // unboxing
        int i10 = b1; // unboxing

        // Integer


        // int(Primitive data type)  : int can contain byte short int
        // Integer (Wrapper Classes) : Integer (Wrapper Classes) can only linked to the  primitive equivalence (int)

        int primitiveInt = 20;

        Integer WrapperInt = primitiveInt;

        primitiveInt  = WrapperInt;
        Byte WrapperClassByte = 5;

        primitiveInt = WrapperClassByte;

    }
}
