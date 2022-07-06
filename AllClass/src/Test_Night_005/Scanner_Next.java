package Test_Night_005;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {

        // for the string to be able to use scanner you need to call next method
        // 2 way to create next amd nextline.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name :");
        String firstName= input.next();
        System.out.println("Enter your lastname :");
        String lastName = input.next();

        String fullName = firstName + "  "  + lastName;
        System.out.println(fullName);

        System.out.println("Grade for student ");
        int grade = input.nextInt();
        System.out.println(firstName + " grade is :" +grade);

        System.out.println("Enter a grade letter :");
        String gradeLetter = input.next();
        System.out.println(firstName + " grade for student :" + gradeLetter);





    }
}
