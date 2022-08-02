package Homework_02;

public class Homework_01M {
    // Write a program that will print the sum of the even numbers between 0-20 * include . Please use for loop and if statement.
    public static void main(String[] args) {
        int value = 0;

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                value = value + i;
            }
        }
        System.out.println( "Sum of the even number between 0-20 is : " + value);
    }
}
