package Homework_09;

import java.util.Arrays;

public class Homework_08 {
    /*
    Write a code with following requirements:
    - Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
    - Print the minimum number in the given array
     */

    public static void main(String[] args) {

        int [] num = {6,7,2,3,90,-2,-90,-122,96,35};

        int min = num[0];

        for (int i = 0; i < num.length; i++) {

            if (min>num[i]){

                min = num[i];
            }

        }
        System.out.println("Minimum number is : " + min);

    }
}
