package Class_Day_019;

import java.util.Scanner;

public class MethodExample2 {
    // Write a method that has 3 input parameters and find the max number between those 3 number

    public static void MyFunc(int a, int b, int c){

        int max = 0;

        if      (a > b && a > c)    { max = a; }
        else if (b > a && b > c)    { max = b; }
        else                        { max = c; }

        System.out.println("The max number is : " + max);
    }

    public static void CallMyFunc(){

        Scanner sc = new Scanner(System.in);



        System.out.println("Enter a name : ");
        String name = sc.nextLine();

    }
    // Print name multiple time in the for loop
    public static void PrintName (String name){
        System.out.println("The name you enter is " + name);
    }

    public static void main(String[] args) {
        CallMyFunc();

        MyFunc(18,20,50);

        for (int i = 0; i <= 10; i++) {

            PrintName("OMAR");

        }
    }
}
