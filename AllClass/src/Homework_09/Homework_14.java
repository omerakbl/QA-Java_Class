package Homework_09;

import java.util.Arrays;

public class Homework_14 {
    public static void main(String[] args) {

        /*

        Write code where it shifts all the elements in array by one index and put the the first index at the end of the array
        example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}

        */

        int[] num = {2,3,4,5,6,7,8,9};

        int [] shifted = new int[8];


        for (int i = 0; i < num.length; i--) {


            if (shifted[num.length] == num.length ) {
                shifted[num.length] = num[i];
            }
            shifted[i] = num[i];


        }

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(shifted));



    }
}
