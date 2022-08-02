package Class_Day_013;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("Please select the operation \n 1: Addition \n 2: Subs \n 3: Multi \n 4: Division \n 5: Exit ");
        int operation = calculator.nextInt();

        while (operation==1 || operation==2 || operation==3 || operation==4 || operation==5){
            System.out.println("Please enter your first number : ");
            double num1 = calculator.nextDouble();
            System.out.println("Please enter your second number : ");
            double num2 = calculator.nextDouble();

            if (operation==1){
                double result = num1+num2;
                System.out.println(" Result is : " + result);
            } else if (operation==2) {
                double result = num1-num2;
                System.out.println("Result is : " + result );

            } else if (operation==3) {
                double result = num1*num2;
                System.out.println(" Result is : " + result );

            } else {
                double result = num1/num2;
                System.out.println(" Result is : " + result);

            }
            System.out.println("Please select the operation \n 1: Addition \n 2: Subs \n 3: Multi \n 4: Division \n 5: Exit ");
            operation = calculator.nextInt();

        }


    }
}
