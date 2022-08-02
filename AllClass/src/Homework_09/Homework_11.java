package Homework_09;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_11 {
    public static void main(String[] args) {
        /*
        Write   a   program   that   creates   an   array   of   10   elements   size.
        Your   program   should   prompt   the   user   to   input   numbers   in   array   and   then   display   the   sum   of   all
        array   elements.
         */

        Scanner sc = new Scanner(System.in);

        int [] num = new int[10];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {

            System.out.println("Please enter 10 numbers");
            int input = sc.nextInt();
            num[i] = input;
            sum = sum + num[i];

        }
        System.out.println(Arrays.toString(num));
        System.out.println("Sum of the all the number that entered is : " + sum);

    }
}
