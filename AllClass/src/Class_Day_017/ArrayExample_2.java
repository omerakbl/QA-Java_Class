package Class_Day_017;

import Class_Day_015.Array;

import java.util.Arrays;

public class ArrayExample_2 {
    public static void main(String[] args) {

        // Write a code where it will get all the word in a string and put in to an array then lets reverse the words

        String x = "Java is sometimes cool";

        String [] arr = x.split(" ");

        System.out.println("The array : " + Arrays.toString(arr));

        // {cool,sometimes,is,Java}

        String [] reverse = new  String[arr.length]; // reverse = {null,null,null,null}
        int k = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {

            reverse [k] = arr[i];
            k++;

        }
        System.out.println(Arrays.toString(reverse));

    }
}
