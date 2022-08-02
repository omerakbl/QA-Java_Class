package Homework_09;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_015 {
    public static void main(String[] args) {

        /*
        Write a code where it ask user to enter a Sentence, Find the longest word in the sentence and print it with the length of it.
        ex. ,"I love being outside with my dog but I have a lot to do today"
        asnwer: Outside and the length is 7
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a sentence ");

        String input = sc.nextLine();

        String[] inputS = input.split(" ");
        int x = 0;
        String lenght = inputS[x];



        for (int i = 0; i < inputS.length; i++) {

            if (lenght.length() <  inputS[i].length()) {

                lenght = inputS[i];


            }

            x++;


        }
        System.out.println("The longest word is : " + lenght + " and length of it is " + lenght.length());

    }
}
