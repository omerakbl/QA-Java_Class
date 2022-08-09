package Homework_09;

import java.util.Arrays;

public class Homework_016 {
    public static void main(String[] args) {
        /*
        Write a code where you short all the integer values in an array in descending order (Do not use the Arrays.short() )
         */

        int [] num = {0,-1,-2,-3,4,5,6,7,8,9};
        int  shor = 0;

        int x = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {

                if (num[i] > num[j]){
                    shor = num[i];
                    num[i] = num[j];
                    num[j] = shor;
                }
            }
        }

        System.out.println(Arrays.toString(num));



    }
}
