package Homework_05;

import java.util.Scanner;

public class Homework_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string value");
        String input = sc.nextLine();
        String polindrome = "";
        String reverse = "";
        int count=0;
        boolean check = false;


        for (int i = 0; i < input.length()-3; i++) {
            polindrome=input.substring(i,i+3);

            for (int x = polindrome.length()-1; x >=0 ; x--)
            {
                reverse += polindrome.charAt(x);
            }if (polindrome.equals(reverse)){
                check=true;
                count++;


            }else {
                check=false;
                System.out.println("Not polindrome");

            }


            System.out.println(polindrome  + count);
        }

        }
    }