package Homework_09;

public class Homework_023 {
    public static void main(String[] args) {
        /*
        write a method where it takes 2 double values and 1 integer value.
        When the integer value is 1 it returns to sum of the 2 double numbers,
        when integer is 2 it returns the subtraction of those 2 double number,
        when integer value is 3 it returns to the multiplication of those 2 double numbers,
        and when the integer value is 4 it returns the division of those 2 double numbers
         */
        cal(2,4.5,5.5);

    }
    public static void cal(int int1, double doub1, double doub2){
        double result = 0;
        if (int1 == 1){
            result = doub1 + doub2;
            System.out.println(result);
        } else if (int1 == 2) {
            result = doub1 - doub2;
            System.out.println(result);
        }else if (int1 == 3) {
            result = doub1 * doub2;
            System.out.println(result);
        }else if (int1 == 4) {
            result = doub1 / doub2;
            System.out.println(result);
        } else {
            System.out.println("Invalid number");
        }
    }
}
