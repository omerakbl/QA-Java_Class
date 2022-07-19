package Team_01;

import java.util.Scanner;

public class Homework_04 {
    public static void main(String[] args) {
        /*
        Write a code where the user is asked to enter an integer number
      - sum of all the odd numbers between 1 to given number (included) but exclude the 9,11,23,35 from the total sum if those numbers happens to be in the range of 1 to given number.
      - The sum should not exceed 300
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int input = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= input; i+=2) {


            if (i == 9 || i == 11 || i == 23 || i == 35){
                continue;
            }

            else
            {
                result =result+i;
            }
            System.out.println(result);

        }

    }
}
