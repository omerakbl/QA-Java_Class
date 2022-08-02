package Homework_02;


public class Homework_03M {
    public static void main(String[] args) {
        //Write   a   program   that   will   count   how   many   times   "a"   is   found   in   any   given   String:
        //String mystring="java is fun, but sometimes java is just pain.Love java java java";



        String sentence ="java is fun, but sometimes java is just pain.Love java java java";

        int count = 0;

        for (int i = 0; i<sentence.length(); i++){

            if (sentence.charAt(i) == 'a' ){
                count++;

            }
        }
        System.out.println("Senctence contains " + count + " times a");

    }
}
