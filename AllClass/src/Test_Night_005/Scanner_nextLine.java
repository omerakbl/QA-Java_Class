package Test_Night_005;

import java.util.Scanner;

public class Scanner_nextLine {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

         System.out.println("Employee first name :");

         String firstName = scan.next(); // it only accept one word (next)
         System.out.println("first name is :" + firstName);

         scan.nextLine(); // accept enter


        System.out.println("Employee full name is :");
        String fullName = scan.nextLine(); // It accept more than two word (nextLine)
        System.out.println("Full name is:" + fullName);

        ////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Employee company name :");
        String companyName = scan.nextLine();
        System.out.println( fullName + " Employee company name is : " + companyName);

        ////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println( "Employee age : ");
        int age=scan.nextInt();
        System.out.println(fullName + " age is  " + age + " and he is working for " + companyName);

        ////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Employee salary : ");
        double salary=scan.nextDouble();
        System.out.println(fullName + " age is  " + age + " and he is working for " + companyName + " and he is salary is " + salary + "$");



    }
}
