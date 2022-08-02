package Homework_01;

import java.util.Scanner;

public class Homework_005_3 {
    public static void main(String[] args) {
        Scanner homework = new Scanner(System.in);

        System.out.println("Please entere name here : ");
        String nameEnter = homework.nextLine();
        String name = nameEnter ;

        if (nameEnter.startsWith("C") && nameEnter.endsWith("K")){
            if (nameEnter.contains("Clark") || nameEnter.contains("CLARK")){
                System.out.println("The name is : " + name);
            }

        } else if (nameEnter.startsWith("c") && nameEnter.endsWith("k")) {

            if (nameEnter.contains("clark") || nameEnter.contains("CLARK")){
                System.out.println("The name is : " + name);
            }
        } else if (nameEnter.startsWith("C") && nameEnter.endsWith("k")) {

            if (nameEnter.contains("Clark") || nameEnter.contains("CLARK")) {

                System.out.println( "The name is : " +name);
            }
        }else if (nameEnter.startsWith("c") && nameEnter.endsWith("K")) {

            if (nameEnter.contains("clarK") || nameEnter.contains("CLARK")) {

                System.out.println( "The name is : " + name);
            }
        } else {
            System.out.println("Invalid name");
        }

    }
}
