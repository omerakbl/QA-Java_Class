package Class_Day_020;

import java.util.Arrays;

public class Example {

    // Write a method where it takes 2 int arrays as input parameters and combine those 2 arrays and returns to 1 int array
    public static int [] MethodforArrays(int [] arr1, int [] arr2){
        int  size = arr1.length + arr2.length;
        int []  Array3 = new int[size];

        for (int i = 0; i < arr1.length; i++) {

            Array3 [i] = arr1[i];

        }
        int x = 0;
        for (int i = arr1.length; i < size ; i++) {

            Array3[i] = arr2[x];
            x++;

        }
        return Array3;
    }
    public static void main(String[] args) {

        int [] Array1 = {2,3,1,90};
        int [] Array2 = {30,7,13,18,37,45,21,1905};

        int [] result = MethodforArrays(Array1,Array2);

        System.out.println("The returned arrays is : " + Arrays.toString(result));




    }

}
