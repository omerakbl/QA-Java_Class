package Test_Night_007;

//import java.lang.String; no need import because java will import automatically anything start with java.lang

public class StringClasses {
    public static void main(String[] args) {

        /*
        in Java, string is an object that represent a sequence of characters.
        The java.lang.String class is used create a string object.

        How to create a string object?
        There are two ways to create String object :

        1.By string literal
        2.By new keyword
         */

        // create a string object 1.By string literal

        /* Java String literal is created by using double quotes. For Example:

           String str1 = "Hello";
           Each time you create a string literal, the JVM checks the "string constant pool" first.
           If the string already exist in the pool, a reference to the pooled instance is returned.
           If the string doesn't exist in the pool, a new string instance is created and placed in the pool.

           For example :
         */

        String str1 = "Hello"; // first it will check the pool and since I don't have Hello it is going to
                               // If strings doesn't exist in the pool, a new string instance is created and placed in the pool.
        String str2 = "Hello"; // it doesn't create a new instance
        // If the string is already exist in the pool, a reference to the pooled instance is returned.

        // Why Java uses the concept of String literal?
        // to make Hava more memory efficient
        // (because no new object are created if it exists already in the string constant)


        // 2. By new keyword
        String str3 = new String ( "Hello");
        // String str3=new String ("Hello"); // create two object and one reference variable
        // In such case, JVM will create a new string object in normal  (non-pool) java heap memory,


        // and the literal "Hello" will be place in the string constant pool.
        // the variable str3 will refer to the object in a heap (non-pool).

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false we have 2 different object so that is why its false


        // What is differences between == vs string.equal methods


    }
}
