package Homework_09;

import java.util.Scanner;

public class Homework_13 {
    public static void main(String[] args) {
        /*
         Write a code where user is asked to enter for 5 employee salaries and store those salaries
         Then find the average salary of those 5 employees
         */

        Scanner sc = new Scanner(System.in);

        int [] input = new int[5];
        int avg = 0;

        for (int i = 0; i < input.length; i++) {

            System.out.println("Please enter the employee salary");
            input[i] = sc.nextInt();
            avg += input[i];

        }
        System.out.println("Avarege salary for 5 employee is " + avg / input.length);

    }
}
