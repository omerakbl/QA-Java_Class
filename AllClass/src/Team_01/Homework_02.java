package Team_01;

import java.util.Scanner;

public class Homework_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        - Write a code where user is asked to enter a string
        - create a new string with entered string but do not include 'L' 'M', 'T' 'E' in the new string
        - print the new string
         */

        System.out.println("Please write anything : ");

        String input = sc.nextLine();
        String result = "";

        for (int i = 0; i < input.length(); i++) {


            if (input.charAt(i) =='L' || input.charAt(i) == 'M' || input.charAt(i) == 'T' || input.charAt(i)== 'E'){
                continue;

            }
            result = result+input.charAt(i);

        }
        System.out.println(result);



    }
}
