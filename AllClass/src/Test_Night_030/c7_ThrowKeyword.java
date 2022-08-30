package Test_Night_030;

import MyLibrary.Library;

import java.util.NoSuchElementException;

public class c7_ThrowKeyword {
    public static void main(String[] args) {

        NoSuchElementException obj = new NoSuchElementException();
        // throw obj;

        // throw new ArithmeticException();

        try {
            throw new RuntimeException();
        }catch (Exception e){
            System.out.println("e.getStackTrace() = " + e.getStackTrace());
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("Runtime");
        }


        Library.stars();

        try {
            System.out.println(9/0);
        }catch (ArithmeticException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        // Difference between throw and Throw
        // Throw used for to sent exception to console
        // Throws is used for handle exception

    }
}
