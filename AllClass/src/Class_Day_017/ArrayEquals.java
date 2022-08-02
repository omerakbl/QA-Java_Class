package Class_Day_017;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {

        //  Array are object contain multiple values for us
        // In order for 2 arrays to be equal they should have the same values in the same order.

        int [] array1 = {1,2,3,4};
        int [] array2 = {1,2,3,4};

        System.out.println("*******************");

        boolean eq = Arrays.equals(array1,array2);
        System.out.println("Are those 2 arrays equal : " + eq);

        float [] array3 = {2.1f,3.5f,5.0f};
        float [] array4 = {2.0f,3.5f,5.0f};
        System.out.println("Are they equal : " + Arrays.equals(array3,array4));

        System.out.println("*******************");

        // You can assign Array to each other
        int [] array5 = {4,5,6,3};
        int [] array6 = array5;
        System.out.println("Array6 : " + array6);

    }
}
