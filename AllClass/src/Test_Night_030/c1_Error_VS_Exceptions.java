package Test_Night_030;

public class c1_Error_VS_Exceptions {
    //Exceptions and errors both are subclasses of Throwable class.
    // The error indicates a problem that mainly occurs due to the lack of system resources
         // and our application should not catch these types of problems.
         // Some of the examples of errors are system crash error and out of memory error.
         // Errors mostly occur at runtime that's they belong to an unchecked type.
    //
    //Exceptions are the problems which can occur at runtime and compile time.
    // It mainly occurs in the code written by the developers.
    // Exceptions are divided into two categories such as checked exceptions and unchecked exceptions.

    public static void main(String[] args) {
    method(5);
    }
        public static void method(int i){

        while (i!=0){
            i=i+1;
            method(i);
        }
    }

}
class ExceptionExample{

    public static void main(String[] args) {
        int number1  = 150;
        int number2 = 0;

        int result = number1/number2; // ArithmeticException: / by zero
    }
}
