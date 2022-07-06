package Class_Day_008;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your full name : ");
        String fullName = scan.nextLine();
        System.out.println("Your full name is  : " + fullName);

        System.out.println("Please enter the company name : ");
        String companyName = scan.nextLine();
        System.out.println("Your company name is : " + companyName);


        System.out.println("Please enter your ANAN : ");
        String ananName = scan.nextLine();
        System.out.println("You anan name is : " + ananName);
    }
}
