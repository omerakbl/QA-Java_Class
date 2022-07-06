package Class_Day_008;

import java.util.Scanner;

public class Scanner_Example {
    public static void main(String[] args) {
        // Lets create Calculator
        // Lets as user to enter first number
        // Then ask user to enter second number
        // Select the operation

        Scanner calculator = new Scanner(System.in);
        System.out.println( "Welcome to CALCULATOR" );

        System.out.println("Enter the your first number : ");
        double firstNumber = calculator.nextInt();
        System.out.println("Your first number is : " + firstNumber);


        System.out.println("Enter the your first number : ");
        double secondNumber = calculator.nextInt();
        System.out.println("Your second number is : " + secondNumber);

        System.out.println("1) Select 1 for Multiplication \n 2) Select for Division \n 3) Select 3 for Addition \n 4) Select 4 for subtraction");
        int operation = calculator.nextInt();

        switch (operation){

            case 1: double result =  firstNumber * secondNumber;
                System.out.println("The result is :" + result);
            break;

            case 2: double result2 =  firstNumber / secondNumber;
                System.out.println("The result is :" + result2);
            break;

            case 3: double result3 =  firstNumber + secondNumber;
                System.out.println("The result is :" + result3);
            break;

            case 4: double result4 =  firstNumber - secondNumber;
                System.out.println("The result is :" + result4);
            break;
            default:
                System.out.println("Operation is not valid");
        }


    }
}
