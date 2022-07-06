package HomeWork;

import java.util.Scanner;

public class Homework_004_3 {
    public static void main(String[] args) {

        Scanner revenue = new Scanner(System.in);

        System.out.println("Sold products : ");
        int product = revenue.nextInt();
        System.out.println("You sell this much product : " + product);

        System.out.println("Please enter the product price :");
        int price = revenue.nextInt();
        System.out.println("Product price is : ");

        int revenueTotal = product*price;
        System.out.println("Total revenue is : " + "$" + revenueTotal  );


    }
}
