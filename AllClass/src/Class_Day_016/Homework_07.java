package Class_Day_016;

import java.util.Scanner;

public class Homework_07 {
    public static void main(String[] args) {
        /*
        Write code where:
    - User is asked to enter a string,
    - Use that string to see how many of 3 character substring is Palindrome
    - Print All the substring Palindrome Substrings
    - Example of Substring: word ==> "banana" 3 characters Palindrome substrings are ==> "ana", "nan" "ana". Count is 3.
    PS = This is a little hard question please give your best and make sure you only use the things we have learned so far.
         */

                    // b a n a n a  // ban // ana // nan //
        // index       0,1,2,3,4,5

        // orange  // ora // ran // ang // nge ---  the range is 0 - length -3
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string : ");
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i <= input.length()-3 ; i++) {


            String sub = input.substring(i,i+3); // Starting is included but the end point is not
            String reverseSub = "";


            for (int j = sub.length()-1; j >= 0; j--)
            {
            reverseSub =  reverseSub + sub.charAt(j);
            }

            if (reverseSub.equals(sub))
            {
                count++;
                System.out.println(reverseSub);
            }
        }
        System.out.println(count);
    }
}
