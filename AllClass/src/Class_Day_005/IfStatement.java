package Class_Day_005;

public class IfStatement {

    public static void main(String[] args){

        // If is a condition where it decide if the code block should run or not
        /*
        if( condition "true"){
        hello
        go this way
        so on
         */

        String name= "This is true and java printing this";

        int var1 = 10;

        if (var1 == 10){
            System.out.println(name);
        }

        if (10>11){
            System.out.println();
        }

        // Lets define
        // Will print

        int x = 123123;
        int y = 0;
        int z = -123213;

        boolean xMax = x>z && x>y; // true
        boolean yMax = y>x && y>z; // false
        boolean zMax = z>x && z>y; // false

        if (xMax) {
            System.out.println( "x is greater then " + y + " , " + z );
        }

        if (yMax) {

            System.out.println("y is greater then " + x + z);
        }

        if (zMax){

            System.out.println( "z is greater then y  and z" + x + y );
        }



    }
}
