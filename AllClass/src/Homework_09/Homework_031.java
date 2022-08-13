package Homework_09;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework_031 {
    public static void main(String[] args) {

        /*
        Write a Method where it takes an Integer of ArrayList and returns to an Integer ArrayList where it contains only unique numbers
ex:   list==>   {1,1,2,3,3,4,5,6}
      uniques   ==>   {2,4,5,6}
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,6));
        System.out.println("Before remove"+Arrays.asList(list));

        list.removeAll(Arrays.asList(1,3));
        System.out.println("After removed"+list);
            }
        }




