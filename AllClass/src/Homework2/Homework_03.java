package Homework2;

import java.util.Scanner;

public class Homework_03 {

    /*
    Write a code where user is asked to enter a number.
    Find the sum of all the even numbers between 0 to that number (included)
    Find the sum of all the odd numbers between 0 to that number (included)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int value = scan.nextInt();
        int evenNum = 0;
        int oddNum = 0;

        for (int i=0;i<=value; i++){
            if (i%2==0){
                evenNum += i;
            } else if (i%2!=0) {
                oddNum+=i;

            }
        }
        System.out.println("Sum of the even number : " + evenNum);
        System.out.println("Sum of the odd number : " + oddNum);

    }
}
