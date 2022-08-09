package Homework_09;

public class Homework_021 {
    public static void main(String[] args) {
        /*
        Write a method where it takes 2 strings as a parameter and returns true when 2 strings are equal and return false when they are not equal.
         */
        twoString("OMER", "OMER");


    }
    public static void twoString(String str1, String str2){
        if (str1 == str2){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
