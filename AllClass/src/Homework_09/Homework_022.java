package Homework_09;

import java.util.Arrays;

public class Homework_022 {
    /*
    Write a method where it takes array of integers and returns the sorted version of that array
     */

    public static void main(String[] args) {

        int [] arr2 = {8,6,7,5,4,3,2};
        array(arr2);
    }

    public static int [] array(int [] arr1){

        Arrays.sort(arr1);
        int [] sort = arr1;
        System.out.println(Arrays.toString(sort));

        return sort;



    }
}
