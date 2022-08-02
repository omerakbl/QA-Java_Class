package Homework_01;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

            Scanner challenge = new Scanner(System.in);

        /*
        Write a program Where user is being ask to select items from the list you presented for instance:
        Select 1 for Shirt
        Select 2 for pants
        select 3 for dress
        select 4 for hat
        select 5 for shoes
        User will select one item each time and until users has 3 items.
        shirt price is = 40
        pants price is = 60
        dress price is = 100
        hat price is = 10
        shoes price is = 120
        if user total amount is more than 200, user will receive 20% off on the total price
        */
            System.out.println("LIST OF THE PRODUCT \n Chose your item by number given");
            System.out.println("1) Shirt  40$ \n 2) Pants 60$ \n 3) Dress 100$ \n 4) Hat 10$ \n 5) Shoes 120$");

            int shirt = 40;
            int pants = 60;
            int dress = 100;
            int hat = 10;
            int shoes = 120;
            double price;
            double totalPrice;


            System.out.println("Select your first item : ");
            int firstItem = challenge.nextInt();

            System.out.println("Select your second item : ");
            int secondItem = challenge.nextInt();

            System.out.println("Select your third item : ");
            int thirdItem = challenge.nextInt();

            if (firstItem==1){
                firstItem =  shirt ;

            } else if (firstItem==2) {
                firstItem = pants;

            } else if (firstItem==3) {
                firstItem = dress;

            } else if (firstItem==4) {
                firstItem =  hat;

            } else if (firstItem==5) {
                firstItem = shoes;

            }else System.out.println("Invalid number");



            if (secondItem==1){
                secondItem = shirt ;

            } else if (secondItem==2) {
                secondItem = pants;

            } else if (secondItem==3) {
                secondItem = dress;

            } else if (secondItem==4) {
                secondItem = hat;

            } else if (secondItem==5) {
                secondItem = shoes;

            }else System.out.println("Invalid number");



            if (thirdItem==1){
                thirdItem = shirt ;

            } else if (thirdItem==2) {
                thirdItem = pants;

            } else if (thirdItem==3) {
                thirdItem = dress;

            } else if (thirdItem==4) {
                thirdItem = hat;

            }
            else if (thirdItem==5) {
                thirdItem = shoes;

            }else System.out.println("Invalid number");

            price = firstItem + secondItem + thirdItem;

            if (price>100 && price<=150){
                totalPrice = price  - (price * 0.05);
                System.out.println("Your total price with the %5 discount is :" + totalPrice);

            } else if (price>150 && price<=200) {
                totalPrice = price  - (price * 0.15);
                System.out.println("Your total price with the %15 discount is :" + totalPrice);

            } else if (price>200) {
                totalPrice = price  - (price * 0.20);
                System.out.println("Your total price with the %20 discount is :" + totalPrice);
            }
            else System.out.println("Invalid");
    }
}
