package Class_Day_018;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        //  the for each loop is used when we dont know the starting and ending point but we want to iterate over all the element in collections

        int[] nums = {1, 2, 3, 4, 5};

        // for (DataType variable:collection name){
        //}

        for (int var:nums){
            System.out.println(var);
        }

        String [] St = {"Osman", "Ayse", "Fatma" };

        for (String unimportant :St) {
            System.out.println("Unimportant : " + Arrays.toString(St) );

        }
    }
}
