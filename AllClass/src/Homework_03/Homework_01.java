package Homework_03;

import java.util.Scanner;

public class Homework_01 {
    public static void main(String[] args) {

        /*
        -Write a code where a teacher is entering student's first name, last name and the point they received from the exam.
        - based on the point the code should automatically determine the grade of Student with the full name of the student
        - This should be done for each student
        - Assuming we do not know how many student are there but your code should still handle this situation
        -  example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
        - When the point is between 90 to 100 the grade should be A
        - When the point is between 80 to 90(excluded) the grade should be B
        - When the point is between 70 to 80(excluded) the grade should be C
        - When the point is between 60 to 70 (excluded) the grade should be D
        - When the point is less than 60 the grade should be F
        - Example output ( First Name = Ziya Last Name = Yilmaz Grade: A )
         */
        Scanner grade = new Scanner(System.in);
        System.out.println("Welcome to grade calculator\n for EXIT write 101 in the point \n");



        while (true) {
            System.out.println("Please enter the student first name ");
            String firstName = grade.nextLine();

            System.out.println("Please enter the student last name ");
            String lastName = grade.nextLine();

            System.out.println("Please enter the student point ");
            double studentPoint = grade.nextDouble();
            String result;

            if (studentPoint > 90 && studentPoint <= 100) {
                result = "A";
                System.out.println(" First name : " + firstName + " Last name : " + lastName + " Grade : " + result);

            } else if (studentPoint > 80 && studentPoint <= 90) {
                result = "B";
                System.out.println(" First name : " + firstName + " Last name : " + lastName + " Grade : " + result);

            } else if (studentPoint > 70 && studentPoint <= 80) {
                result = "C";
                System.out.println(" First name : " + firstName + " Last name : " + lastName + " Grade : " + result);

            } else if (studentPoint > 60 && studentPoint <= 70) {
                result = "D";
                System.out.println(" First name : " + firstName + " Last name : " + lastName + " Grade : " + result);

            } else if (studentPoint <= 60) {
                result = "F";
                System.out.println(" First name : " + firstName + " Last name : " + lastName + " Grade : F ");
                }
            else if (studentPoint == 101) {
                    break;
                }
            }
        }
    }


