package Class_Day_017;

import java.util.Arrays;

public class ReverseArrayinPlace {

    public static void main(String[] args) {

        int [] arr = {3,4,5,6,7,8,9,10,-12};

        // Out goal is to get arr = {-12,10,9,8,7,6,5,4,3}

        for (int i = 0; i < arr.length/2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
