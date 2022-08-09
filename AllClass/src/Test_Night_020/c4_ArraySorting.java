package Test_Night_020;

import java.util.Arrays;

public class c4_ArraySorting {
    public static void main(String[] args) {
        int [] number = {5,10,2,20};
        descendingArray(number);

        int [] result = descendingArray2(number);

        System.out.println(Arrays.toString(result));

    }

    public static void descendingArray(int [] arr1){ // 5 10 2 20

        Arrays.sort(arr1); // 2 5 10 20

        for (int i = arr1.length-1; i >= 0 ; i--) {

            System.out.print(arr1[i]+ " ");

        }
        System.out.println();

    }

    //return method
    public static int [] descendingArray2 (int [] arr){

        Arrays.sort(arr);
        int [] descArr = new int[arr.length]; // {0,0,0,0}
                                              // {20 10 5 2

        int lastIndex = arr.length-1;

        for (int i = 0; i < descArr.length; i++) {

            descArr[i] = arr[lastIndex];
            lastIndex--;
         // descArr[0] = arr[3];
         // descArr[1] = arr[2];
         // descArr[2] = arr[1];
         // descArr[3] = arr[0];


        }


        // my descending order array
        return descArr;
    }
}
