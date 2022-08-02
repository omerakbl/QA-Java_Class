package Homework_09;

import java.util.Scanner;

public class Homework_018 {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter a number to between 1 to 7 to get the name of the day of the week.User Array
        ex. When user enters 1 you should print (Monday)

         */
        System.out.println("Please enter a number between 1 to 7");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        String  days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        String [] split  = days.split(" ");

        switch (input){
            case 1 : days = split[0];
                break;
            case 2 : days = split[1];
                break;
            case 3 : days = split[2];
                break;
            case 4 : days = split[3];
                break;
            case 5 : days = split[4];
                break;
            case 6 : days = split[5];
                break;
            case 7 : days = split[6];
                break;
        }
        System.out.println(days);




    }
}
