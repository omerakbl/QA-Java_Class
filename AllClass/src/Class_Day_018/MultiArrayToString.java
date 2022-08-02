package Class_Day_018;

import java.util.Arrays;

public class MultiArrayToString {
    public static void main(String[] args) {

        String [] Stname = {"Osman", "Haydar", "Lucas"};

        System.out.println("The Array : " + Arrays.toString(Stname));

        String [] [] Twname = {{"Osman","Haydar"},{"Bilmem","Ne"}};

        System.out.println("Array two dimention array : " + Arrays.toString(Twname));

        System.out.println("The first array inside of the big array is : " + Arrays.toString(Twname[0]));
        System.out.println("The first array inside of the big array is : " + Arrays.toString(Twname[1]));

        // Using Array.deepToString will allow you to convert all the items for multidimensional array

        System.out.println("All tge items in the Twname arrays : " + Arrays.deepToString(Twname));

        int [] [] [] three = { { {8,5,6,2}, {3,90} }, { {34,78,91}, {1} } };

        System.out.println("The three dimensional : " + Arrays.deepToString(three));
    }
}
