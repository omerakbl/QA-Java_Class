package Class_Day_016;

import Class_Day_015.Array;

import java.util.Arrays;

public class ArrayUtilityCont {
    public static void main(String[] args) {

        //Array.sort(array)
        // the sort will be in increasing order

        int [] number = {90,45,32,-90,-1000,400};
        Arrays.sort(number);

        for (int i = 0; i < number.length; i++) {

            System.out.println(number[i]);

        }

        System.out.println("*************************");

        System.out.println(Arrays.toString(number));

        System.out.println("*************************");

        int [] number2 = {78,34,5,-230,67};

        Arrays.sort(number2);

        // System.out.println(Arrays.sort(number2)); Arrays.sort(ArrayName) will get the array and sort it
        // assign back to same array

        System.out.println(Arrays.toString(number2));

        System.out.println("*************************");

        String [] name = {"name1","name2","name3","name4"};

        Arrays.sort(name);

        System.out.println(Arrays.toString(name));




    }
}
