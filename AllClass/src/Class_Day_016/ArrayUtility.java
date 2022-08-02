package Class_Day_016;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        // Arrays has utility as well

        int [] name = {3,4,5,2,1,-90,-230};

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        System.out.println(name);

        System.out.println("**********************");

        System.out.println(Arrays.toString(name)); // Arrays.toString (ArrayName) will convert all the format to the String

        System.out.println(Arrays.toString(name).replaceAll("-",""));

        System.out.println("**********************");

        String [] starray = {"Iskender", "Osman", "Haydar"};

        System.out.println(Arrays.toString(starray));

    }
}
