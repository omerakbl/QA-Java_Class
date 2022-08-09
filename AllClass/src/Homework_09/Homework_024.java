package Homework_09;

import java.util.Arrays;

public class Homework_024 {
    /*
    Write a method where it takes 2 integer arrays as parameters,
    and returns to the an integer array where it includes 2 highest
    different values in the first array and 2 lowest different values in the second array.
     */
    public static void main(String[] args) {

        int [] ar = {1,2,3,4,1};

        int [] ar2 = {6,7,8,9,4};

        array(ar,ar2);


    }

    public static void array (int [] arr1, int [] arr2){


        int [] resultMax = new int[2]; // {0,0,0,0}
        int x = 0; // count

        for (int i = 0; i < arr1.length; i++) {
            if (resultMax[x] < arr1[i]) { // arr1 indexof (0) < arr1 indexof(0)
                resultMax[x] = arr1[i];
            }
            x++;

        }
        int [] resultMin = new int[2];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {

            if (resultMin[k] > arr2[i] ){
                resultMin[k] = arr2[i];
            }
            k++;

        }

        System.out.println(Arrays.toString((resultMin)));


    }
}
