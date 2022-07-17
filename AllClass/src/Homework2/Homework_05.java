package Homework2;

import java.util.Scanner;

public class Homework_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num = scan.nextInt();
        int value=0;
        for(int x=0; x<=num; x++){
            value=num*x;
            System.out.println(value);
        }
    }

}
