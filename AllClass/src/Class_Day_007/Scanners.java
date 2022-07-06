package Class_Day_007;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {

        // scanner is a library under java
        // this library has ready method that u can use it
        // to be able to use this library we need to call them in our  class
        // and create object from that library


        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        byte byteNumber = scan.nextByte();
        System.out.println("The byteNumber is : " + byteNumber);




    }
}
