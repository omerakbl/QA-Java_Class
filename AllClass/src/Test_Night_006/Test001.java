package Test_Night_006;

import java.util.Scanner;

public class Test001 {
    public static void main(String[] args) {

        Scanner maxnum = new Scanner(System.in);
        System.out.println("Welcome to CALCULATOR");

        System.out.println("Please enter your first number : ");
        double firstNum = maxnum.nextDouble();
        System.out.println("Your first Number : " + firstNum);

        System.out.println("Please enter your second number : ");
        double secondNum = maxnum.nextDouble();
        System.out.println("Your second Number : " + secondNum);

        System.out.println("1) Multiplication \n 2) Division \n 3) Addition \n 4) Subtraction");

        double operation = maxnum.nextDouble();

        if (operation==1){
            double numMul = firstNum * secondNum;
            System.out.println(numMul);
        } else if (operation==2) {
            double numDiv = firstNum / secondNum;
            System.out.println(numDiv);
        } else if (operation==3) {
            double numAdd = firstNum + secondNum;
            System.out.println(numAdd);
        } else if (operation==4) {
            double numSub = firstNum - secondNum;
            System.out.println(numSub);
        }
        else {
            System.out.println("Invalid number");
        }

        }

    }




