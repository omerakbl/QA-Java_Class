package Class_Day_008;

import java.util.Scanner;

public class Scanner_Cont {
    public static void main(String[] args) {
        // We are creating a Scanner Object
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the short number : ");

        // How to Scan the Short Data Type input
        short shortNum = input.nextShort();
        System.out.println("The number that user entered is : " + shortNum);

        // Next Integer number entered by Users

        System.out.println("Please enter Integer number : ");
        int intNum = input.nextInt();
        System.out.println("The integer number is : " + intNum);

        // Next Double number entered by Users

        System.out.println("Please enter Double number : ");
        double doubleNum = input.nextDouble();
        System.out.println("The integer number is : " + doubleNum);

        // Next Float number entered by Users

        System.out.println("Please enter Float number : ");
        float floatNum = input.nextFloat();
        System.out.println("The float number is : ");

        // The String have 2 way to be scanned
        // 1) next () Code will read all the input that can be number, chars or anything consol until it sees a space " ";
        // 2) NextLine()

        String name = "20";




    }
}
