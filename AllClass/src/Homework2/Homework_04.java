package Homework2;

public class Homework_04 {
    public static void main(String[] args) {

        // Write a code where all where prints all the numbers between 0 to 10 (included)

        int number = 0;
        int count = 0;

        for (int x = 10; x >= 0; x--){
            number = x;
            count++;
            System.out.println(number);
        }
        System.out.println(count + " is the loop count");


    }
}
