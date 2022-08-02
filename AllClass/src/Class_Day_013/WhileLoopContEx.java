package Class_Day_013;

import java.util.Scanner;

public class WhileLoopContEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calculator");
        System.out.println("Please select the operation \n 1: Addition \n 2: Subs \n 3: Multi \n 4: Division \n 5: Exit ");
        int con = sc.nextInt();

        while (true){
            if (con == 1 ){
                System.out.println("Please enter first number : ");
                double num1 = sc.nextDouble();
                System.out.println("Please enter second number : ");
                double num2 = sc.nextDouble();
                System.out.println("The result is : " + (num1+num2));
            }
            else if (con == 2 ){
                System.out.println("Please enter first number : ");
                double num1 = sc.nextDouble();
                System.out.println("Please enter second number : ");
                double num2 = sc.nextDouble();
                System.out.println("The result is : " + (num1-num2));
            }
            else if (con == 3 ){
                System.out.println("Please enter first number : ");
                double num1 = sc.nextDouble();
                System.out.println("Please enter second number : ");
                double num2 = sc.nextDouble();
                System.out.println("The result is : " + num1*num2);
            }
            else if (con == 4 ){
                System.out.println("Please enter first number : ");
                double num1 = sc.nextDouble();
                System.out.println("Please enter second number : ");
                double num2 = sc.nextDouble();
                System.out.println("The result is : " + num1+num2);
            }else {
                break;
            }

            System.out.println("Please select the operation \n 1: Addition \n 2: Subs \n 3: Multi \n 4: Division \n 5: Exit ");
            con = sc.nextInt();


        }
        System.out.println("You exit the calculator");
    }
}
