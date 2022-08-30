package Test_Night_030;

import java.io.File;
import java.io.FileInputStream;

public class c2_ExceptionsType {
    //Exceptions: unexpected or unwanted events
//
//	there two types of exception:
//			1.unchecked (unexpected event):If a program throws an unchecked exception,
//			it reflects some error inside the program logic
//			occurs during run time
//				RuntimeException class is the parent of all exceptions
//
//			2.checked (unwanted events): In general, checked exceptions represent errors outside the
//			control of the program.
//			occurs during to compile time. needs to be handled immediately

    public static void main(String[] args) {
        // Unchecked exceptions : (unexpected event) occurs during run time
        System.out.println("Hello");
        // System.out.println(21/0); // fo unchecked exception you won't see any Java warning you will see exception warning at the console (occurs during run time)

        // runtime means during the console

        String str = "Hello Java";
        // System.out.println(str.charAt(100)); // StringIndexOutOfBoundsException

        int [] arr = {10,20,30};
        //System.out.println(arr[100]); //ArrayIndexOutOfBoundsException


        // Checked exceptions : (unwanted events) we need to handle before we run those are will give us warning messages

        // Thread.sleep(3000);

        File file = new File("hello.txt");
        // FileInputStream fileInputStream = new FileInputStream(file); // java.io.FileNotFoundException;

    }

}
