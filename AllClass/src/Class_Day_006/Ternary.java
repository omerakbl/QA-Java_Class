package Class_Day_006;

public class Ternary {
    public static void main(String[] args) {

         // Write a code were  it checks 2 numbers and assign the bigger to variable called max

        int x = 50;
        int y = 50;
        int max;

        if (x>y) {
            max = x;
        }else max = y;

        System.out.println("the max is = " + max);

        //Ternary max = (x>y)?  x:y

        System.out.println("************************");

        max = (x>y) ? x : y;
        System.out.println("max = " + max);

        System.out.println("************************");

        // Check the number if is even or odd

        int num = 90;

        String result;

        if ( num % 2 == 0) {

            result = "Even";
        }

        else result = "Odd";

        System.out.println("The number is : " + result);

        System.out.println("************************");

        result = (num % 2 == 0)? "Even" : "Odd";
        System.out.println("The number is :  " + result);

    }
    }


