package Homework_01;

import java.util.Scanner;

public class Homework_004_4 {

    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);
        System.out.println("Welcome to CALCULATOR");

        System.out.println("Enter the your first number : ");
        int firstNumber = calculator.nextInt();
        System.out.println("Your first number is : " + firstNumber);


        System.out.println("Enter the your first number : ");
        int secondNumber = calculator.nextInt();
        System.out.println("Your first number is : " + secondNumber);

        System.out.println("1) Select 1 for Multiplication \n 2) Select for Division \n 3) Select 3 for Addition \n 4) Select 4 for subtraction");
        int operation = calculator.nextInt();
        String result;

        if (operation==1){
            int numMul = firstNumber * secondNumber;
                        System.out.println(numMul);

        } else if (operation==2) {
            int numDiv = firstNumber / secondNumber;
            System.out.println(numDiv);

        }
        else if (operation==3) {
            int numAdd = firstNumber + secondNumber;
            System.out.println(numAdd);
        }
        else if (operation==4) {
            int numSub = firstNumber / secondNumber;
            System.out.println(numSub);
        }
        else {
            System.out.println("Operation is not valid");
        }


        }
    }


