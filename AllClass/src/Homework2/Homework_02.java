package Homework2;

import java.util.Scanner;

public class Homework_02 {
    /*
    Write a code where user is asked to enter a number and check for every
    number between 0 to that number to see how many number between 0 to that
    number can be divided to 3 and 5 and sum all those number, Print the result
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int number = sc.nextInt();

        int sum = 0;
        int count = 0;

        for (int x = 0; x <= number; x++){

            if (x % 3 == 0 && x % 5 == 0 ){
                sum = sum + x;
                System.out.println(count++ + " - " + " Divided by 3 and 5");
            } else {
                System.out.println(count++ + " - " + " It cant be divided by 3 and 5 ");
            }
        }

        System.out.println("The sum of the number that can be divided by 3 and 5 : " + sum);
        System.out.println("Total count between 0 and " + number + " is  : " + count );


    }
}
