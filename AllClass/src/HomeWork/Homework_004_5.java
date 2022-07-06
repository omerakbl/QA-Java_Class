package HomeWork;

import java.util.Scanner;

public class Homework_004_5 {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.println("Please enter your first name : ");
        String firstName = name.nextLine();

        System.out.println("Please enter your lastname : ");
        String lastName = name.nextLine();

        System.out.println(firstName +  " " + lastName);

    }
}
