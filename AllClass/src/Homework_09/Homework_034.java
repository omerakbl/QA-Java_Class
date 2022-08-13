package Homework_09;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework_034 {
    /*
    Write a method where it takes ArrayList of Stings and the index, returns to the element of that index in the ArrayList
     */

    public static void main(String[] args) {


        ArrayList<String> arrList = new ArrayList<>();

        arrList.addAll(Arrays.asList("Java", "is", "getting", "cooler"));

        System.out.println(arrList);

        System.out.println(arrList.get(2));

    }
}
