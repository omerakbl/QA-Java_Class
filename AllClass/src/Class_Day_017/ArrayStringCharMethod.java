package Class_Day_017;

import java.util.Arrays;

public class ArrayStringCharMethod {
    public static void main(String[] args) {


        // String name = "OmerLucas";
        // name,toCharArray () --> this will get all the chars into char [] (array)


        String name = "OmerLucas";
        char[] charArray = name.toCharArray(); // this will get all the chars in the name String
        System.out.println(Arrays.toString(charArray));

        System.out.println("**********************");

        String name2 = "Blah Blah";

        char [] charArray2  = name2.toCharArray();
        System.out.println(Arrays.toString(charArray2));
    }
}
