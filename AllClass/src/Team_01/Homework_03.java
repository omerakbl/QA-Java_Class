package Team_01;

import java.util.Scanner;

public class Homework_03 {
    public static void main(String[] args) {
        /*
        - Write a code where user is asked to enter a number
        - Print the even sum of the even numbers from 0 to entered number(included) but the Sum should not pass 390
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number : ");

        int input = sc.nextInt();
        int result = 0;

        for (int i = 0; i <= input; i+=2) {
            result=result+i;

            if (result>=390){
                result = result-i;
                    break;

                }

            }
        System.out.println(result);
            }
        }



