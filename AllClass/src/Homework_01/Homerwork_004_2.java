package Homework_01;

import java.util.Scanner;

public class Homerwork_004_2 {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number = numbers.nextInt();

        String result;


        if (number>0){
            result = "Your number is positive";
            System.out.println(result);
        }
        else if (number<0) {
            result = "Your number is negative";
            System.out.println(result);

        }
        else if (number==0) {
            result = "Number is neither negative nor positive, its equal to zero";
            System.out.println(result);

        }
        else {
            result = " Invalid number";
            System.out.println(result);
        }
    }

}
