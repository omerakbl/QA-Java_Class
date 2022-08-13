package Homework_09;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework_033 {

    public static void main(String[] args) {
        
        /*
        Write a Method where it takes String and return ArrayList of All the numbers in the String
ex: String str = "This234 is ju3st St1in6" 
 srrlsit = {2,3,4,3,1,6} 
hint in order to check if Character is a number or not ( boolean check = Character.isDigit(str.charAt(i) )
         */
        
        
        String str = "This234 is ju3st St1in6";



        char [] arr = str.toCharArray();

        ArrayList<String> arrList = new ArrayList<>();



        for (int i = 0; i < arr.length; i++) {

            if (Character.isDigit(str.charAt(i)) == true){

                arrList.add(String.valueOf(arr[i]));
            }
        }

        System.out.println("Number in the string is " + arrList);

    }


}
