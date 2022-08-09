package Test_Night_022;

public class c1_WrapperClasses {

    /*
    Java Wrapper Classes
    Java Wrapper Classes provide a way to use primitive data types (int,boolean, etc..) as object

    The table below shows the primitive type and equivalent wrapper classes:

    Primitive Data Type                 Wrapper Classes
    byte                                Byte
    short                               Short
    int                                 Integer
    long                                Long
    float                               Float
    double                              Double
    boolean                             Boolean
    char                                Character

    Sometimes you must use wrapper classes, for example when working with Collection object, such as ArrayList,
    where primitive types cannot be used (the list can only store objects):

    Example
    ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
    ArrayList(Integer) myNumbers = new ArrayList<Integer>(); // Valid

    Data Structure:
        1. Array
        2. Collection ==> only accepts objects
        3. Map ==> only accepts objects


    Primitives      : byte, short, int, long, float, double, char, boolean

    Wrapper Classes : Byte, Short, Integer, Long, Float, Double, Char, Boolean

     */

    public static void main(String[] args) {

        Integer myInt  = 10; // Wrapper class
        int i1 = 10; // primitive data
        Double myDouble = 10.25;
        Character ch = 'a';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(ch);

        short sh1 = 100;
        int i2 = sh1;

        Integer int1 = i2;
        // Integer int2 = sh1; // Integer is another form of int primitive data type you cant assign other primitive data type

        Byte b1 = 10;
        byte b2 = 15;
        Byte b3 = b2;

        int i4 = b3;

        System.out.println("********************");
        System.out.println(b1); // 10
        System.out.println(b2); // 15
        System.out.println(b3); // 15
        System.out.println(i4); // 15

        // useful method is the toString() method, which is used to convert wrapper objects to strings.

        // in the following example , we convert an Integer to String, and use the length() method of the
        // String class to output the length  of the "string"

        Integer myInt10 = 200;
        String str = myInt10.toString(); // which is used to convert wrapper object to strings "200"
        System.out.println(str.length()); // 3

    }


}
