package Homework_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework_032 {

    public static void main(String[] args) {

        /*
        Write methods where it takes the ArrayList of Double
1) first method returns to max number
2) second method returns to min number
3) third Method prints all element one by one on the same line ( ex = the List is: 100.9, 12.45, 30.46 )
         */

        ArrayList<Double> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(5.5,10.5,6.5,200.5,150.5,250.80,1.3));

        System.out.println(Collections.max(arrList));
        System.out.println(Collections.min(arrList));
        System.out.println(arrList);




    }
}
