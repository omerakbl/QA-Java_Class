package Class_Day_017;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {


        // Adding 2 array into one
        int [] arr1 = {2,3,4,5};
        int [] arr2 = {3,4,5,6,7};

        int size = arr1.length + arr2.length; // size = 9

        int [] arr3 = new int[size]; // {0,0,0,0,0.......} at the init stage

        for (int i = 0; i < arr1.length; i++) {

            // arr3 = 0

            arr3 [i] = arr1[i]; // i = 0 arr3[0] = arr1[0] == 2

        }
        // arr3 = {2,3,4,5,0,0,0,0,0}
        int k = 0;

        for (int i = arr1.length; i < size; i++) {

            arr3[i] = arr2[k];
            k++;

        }
        System.out.println(Arrays.toString(arr3));

        }
    }

