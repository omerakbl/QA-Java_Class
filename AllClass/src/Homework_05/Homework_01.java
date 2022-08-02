package Homework_05;

import java.util.Scanner;

public class Homework_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Prime number check system");
        int input = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < input; i++) {
            if (input%i == 0){
                isPrime = false;
                break;
            }

        }
        if (isPrime){
            System.out.println(input + " is a Prime number");
        }else {
            System.out.println(input + " is not Prime");
        }

    }
}