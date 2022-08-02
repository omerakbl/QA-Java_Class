package Homework_05;

import java.util.Scanner;

public class Homework_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string value");
        String input = sc.nextLine();
        String reverse = "";
        for (int i = input.length()-1; i >=0; i--) {

            reverse = reverse + input.charAt(i);



        }
        System.out.println(reverse);
    }
}
