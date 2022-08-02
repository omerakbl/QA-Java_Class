package Homework_09;

import java.util.Arrays;

public class Homework_016 {
    public static void main(String[] args) {
        /*
        Write a code where you short all the integer values in an array in descending order (Do not use the Arrays.short() )
         */

        int [] num = {0,-1,-2,-3,4,5,6,7,8,9};
        int [] minus = new int[num.length];
        int [] plus = new  int[num.length];
        int x = 0;

        for (int i = 0; i < num.length; i++) {

            if (num[i]<0){
                minus[x] = num[i];
            }
            x++;
        }
        int k = 0;
        for (int j = 0; j < num.length; j++) {
            if (num[j]>=0){
                plus[k] = num[j];
            }
            k++;

        }
        System.out.println(Arrays.toString(minus));
        System.out.println(Arrays.toString(plus));


    }
}
