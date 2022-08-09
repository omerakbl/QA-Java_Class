package Homework_09;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_017 {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter 10 numbers and store those number in the integer array.
        Print the max number and all the element in the array(Yo can use Arrays.toString() method)
         */

        Scanner sc = new Scanner(System.in);

        int [] num = new int[10];
        int max = 0;

        for (int i = 0; i < num.length; i++) {

            System.out.println("Please enter a number");
            num[i] = sc.nextInt();
            if (max< num[i])
             //
                max = num[i];

            }

        System.out.println(" Your numbers are " + Arrays.toString(num));
        System.out.println("The maximum number that entered is " + max);

    }
}
