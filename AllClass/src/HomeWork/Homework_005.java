package HomeWork;

import java.util.Scanner;

public class Homework_005 {
    public static void main(String[] args) {
        Scanner homework = new Scanner(System.in);

        System.out.println("Please enter a name that start with A and end with L \n then we will replace A with the B");

        String nameStart= homework.nextLine();
        String name = nameStart;


        nameStart = nameStart.startsWith("A") && nameStart.endsWith("L") ? name = nameStart.replaceFirst("A" , "B") :

                    nameStart.startsWith("a") && nameStart.endsWith("l")? name = nameStart.replaceFirst("a" , "B") :

                    nameStart.startsWith("A") && nameStart.endsWith("l")? name = nameStart.replaceFirst("A" , "B") :

                    nameStart.startsWith("a") && nameStart.endsWith("L")? name = nameStart.replaceFirst("a" , "B") :
                        "Name is not starting with A or not finishing with L";

        System.out.println(name);

        }
    }

