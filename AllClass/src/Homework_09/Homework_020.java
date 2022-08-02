package Homework_09;

import java.util.Scanner;

public class Homework_020 {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter a sentence, find how many of the character 'a'(ignore the case) is in
        the sentence and where is the index of that specific 'a' in the sentence.
        ex. "A cat was found on the street of Nashville"
        answer:
        "A" is in index of 0,
        "a" is in index of 3.
        "a" is in index of 7.
        "a" is in index of 23.
        Count of "a"s is : 4
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = sc.nextLine();
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'A'){
                System.out.println(sentence.charAt(i) + " is in index of " + count);
            }
            count++;

        }


    }
}
