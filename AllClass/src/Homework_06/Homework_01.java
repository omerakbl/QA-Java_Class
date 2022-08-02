package Homework_06;

import java.util.Random;
import java.util.Scanner;

public class Homework_01 {
    /*
 *
 * // Guessing game
 * //Please follow the step in the below
 *
 * // Step 1-  Create 2 int variables with name of randomNumber , userInput;
 *
 * //Step 2- Create a program will generate random a number between 1 to 10
 *
 * to generate a random number use >>
 *
 *  Random random=new Random();
 *  int randomNumber = random.nextInt(10) + 1;
 *
 *
 * // Step 2- Ask user to enter a number to enter a number between 1-10
 *
 * //Step 3-  Create a logic with do while loop that will ask user
 * to enter a number as long as random number and userInput are not matching.

     */
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int input = sc.nextInt();

        do {
            System.out.println("Not MATCH");
            input = sc.nextInt();
        }

        while (randomNumber != input);

        if (randomNumber == input)
        {
            System.out.println("Match");
        }
    }
}

