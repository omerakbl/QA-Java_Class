package Homework2;

import java.util.Scanner;

public class Homework_01 {
    //        Write a code where user is asked to enter an integer number:
    //        1) Using the given number find the factorial of that number and Print the result.
    //        example: 5 ==> 5! = 5*4*3*2*1 = 120
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Please enter a integer number : ");
        int value = sc.nextInt();
        int factorial = 1;
        int count = 0;
        for (int x = 1; x <= value  ; x++){
            factorial = factorial * x;
            count = count + 1;
            System.out.println(count + "!");

        }

        System.out.println(factorial);


    }
}
