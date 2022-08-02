package Homework_09;

import java.util.Scanner;

public class Homework_019 {
    public static void main(String[] args) {

        /*
        Write a code where user enters a sentence. Find how many of those words contains the "da"(ignore the case) and
        print the word if it contains "da"(ignore the case)
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String input = sc.nextLine();
        String [] split = input.split(" ");
        int count = 0;

        for (int i = 0; i < split.length; i++) {

            if (split[i].contains("da") || split[i].contains("DA") ){
                System.out.println("The word contains da ---> " + split[i]);
                count++;
            }

        }
        System.out.println("Your sentence contain " + count + " this much da");

    }
}
