package Test_Night_022;

import java.util.ArrayList;

public class c7_ListPractice {

    // create an list of Integers
    // Add 4 numbers
    // return maximum number

    public static void main(String[] args) {


        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(-250);
        numberList.add(57);
        numberList.add(-600);
        numberList.add(0);

        // just assume max number us list index 0
        int maximum = numberList.get(0);
        // create your loop that will check eacj number and compare with maximum number
        // if it is bigger it will reassign to maximum

        for (int i = 0; i <= numberList.size() -1 ; i++) {

            if (maximum < numberList.get(i)) {
                maximum = numberList.get(i);
            }

        }
        System.out.println(maximum);

        // create logic that will print minimum number

        int minimum = numberList.get(0);

        for (int j = 0; j <= numberList.size() -1 ; j++) {

            if (minimum > numberList.get(j)) {
                minimum = numberList.get(j);
            }

        }
        System.out.println(minimum);

    }
}
