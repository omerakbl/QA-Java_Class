package HomeWork;

import java.util.Scanner;

public class Homerwork_004_1 {
    public static void main(String[] args) {

        Scanner maxnumber = new Scanner(System.in);
        System.out.println( "Welcome to maximum number finder" );

        System.out.println("Enter the your first number : ");
        int firstNumber = maxnumber.nextInt();
        System.out.println("Your first number is : " + firstNumber);


        System.out.println("Enter the your second number : ");
        int secondNumber = maxnumber.nextInt();
        System.out.println("Your second number is : " + secondNumber);

        System.out.println("Enter the your third number : ");
        int thirdNumber = maxnumber.nextInt();
        System.out.println("Your third number is : " + secondNumber);

        String result;

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            result = "1st number that entered is maximum which is : " + firstNumber;
            System.out.println(result);
        }

        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            result = "2nd number that entered is maximum which is : " + secondNumber;
            System.out.println(result);

        }

        else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            result = "3th number that entered is maximum which is : " + thirdNumber;
            System.out.println(result);

        }

        else {
            result = "Invalid numbers";
            System.out.println(result);
        }

    }



    }




