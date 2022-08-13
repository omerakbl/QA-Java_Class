package Homework_09;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework_030 {

    public static void main(String[] args) {
        String [] letters1 = {"A",   "B",   "C"};
        String [] letters2 = {"D",   "E",   "F",   "G"};

        ArrayList<String> arrList = new ArrayList<>();

        arrList.addAll(Arrays.asList(letters1));
        arrList.addAll(Arrays.asList(letters2));

        System.out.println("arrList = " + arrList);


    }
}
