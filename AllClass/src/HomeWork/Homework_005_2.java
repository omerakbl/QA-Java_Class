package HomeWork;

import java.util.Scanner;

public class Homework_005_2 {
    public static void main(String[] args) {

        System.out.println("Please enter a name that start with A and end with L \n then we will replace A with the B");
        Scanner homework = new Scanner(System.in);

        String nameStart = homework.nextLine();
        String name = nameStart;

        if (nameStart.startsWith("B") && nameStart.endsWith("L")) {
            if (nameStart.contains("a")) {
                name = nameStart.replace("a", "G");
                System.out.println(name);
            } else if (nameStart.contains("A")) {

                name = nameStart.replace("A", "G");
                System.out.println(name);

            }
        } else if (nameStart.startsWith("b") && nameStart.endsWith("l")) {
            if (nameStart.contains("A")) {
                name = nameStart.replace("A", "G");
                System.out.println(name);
            } else if (nameStart.contains("a")) {

                name = nameStart.replace("a", "G");
                System.out.println(name);

            }
        } else if (nameStart.startsWith("B") && nameStart.endsWith("l")) {
            if (nameStart.contains("A")) {
                name = nameStart.replace("A", "G");
                System.out.println(name);
            } else if (nameStart.contains("a")) {

                name = nameStart.replace("a", "G");
                System.out.println(name);

            }
        } else if (nameStart.startsWith("b") && nameStart.endsWith("L")) {
             if (nameStart.contains("A")) {
                name = nameStart.replace("A", "G");
                System.out.println(name);
            } else if (nameStart.contains("a")) {

                name = nameStart.replace("a", "G");
                System.out.println(name);
            }
        } else {
            System.out.println("invalid word");
        }
    }
}







