package Homework2;

import java.util.Scanner;

public class Homework_04M {
    public static void main(String[] args) {

        /** INTERVIEW QUESTION.


         * Task : Write a program that checks if a String is a Palindrome.
         *
         * Example: input : Java , output: java is not  palindrome
         * Example: input : kayak , output : kayak is a palindrome
         * Example: input level , ouput : level is a palindrome
         *
         * tip: A palindrome is a word, number, phrase, or other sequence of characters
         * which reads the same backward as forward, such as madam or racecar.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine();
        String reverseWord = "";


        for (int i =  word.length()-1; i>=0; i--  ){
            reverseWord = reverseWord + word.charAt(i);
        }
        if (word.equals(reverseWord)){
            System.out.println("Input is palindrome");
        } else{
            System.out.println("Input not palindrome");
        }


    }
}
