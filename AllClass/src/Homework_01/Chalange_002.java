package Homework_01;

import java.util.Scanner;

public class Chalange_002 {
    public static void main(String[] args) {

        Scanner challenge = new Scanner(System.in);
        System.out.println("LIST OF THE PRODUCT \n Chose your item by number given");
        System.out.println("1) Shirt  40$ \n 2) Pants 60$ \n 3) Dress 100$ \n 4) Hat 10$ \n 5) Shoes 120$");

        int shirt = 40;
        int pants = 60;
        int dress = 100;
        int hat = 10;
        int shoes = 120;
        double price;
        double totalPrice;
        String invalid= "Invalid input";


        System.out.println("Select your first item : ");
        int firstItem = challenge.nextInt();

        System.out.println("Select your second item : ");
        int secondItem = challenge.nextInt();

        System.out.println("Select your third item : ");
        int thirdItem = challenge.nextInt();


        firstItem  =(firstItem==1) ? shirt: (firstItem==2) ? pants : (firstItem==3) ? dress : (firstItem==4) ? hat : (firstItem==5) ? shoes : 0 ;
        secondItem =(secondItem==1) ? shirt: (secondItem==2) ? pants : (secondItem==3) ? dress : (secondItem==4) ? hat : (secondItem==5) ? shoes : 0;
        thirdItem  =(thirdItem==1) ? shirt: (thirdItem==2) ? pants : (thirdItem==3) ? dress : (thirdItem==4) ? hat : (thirdItem==5) ? shoes : 0;

        price=firstItem+secondItem+thirdItem;

        totalPrice=
                (price>=200) ?  (price-(price * 0.2)) :

                        (price>150 && price<200) ? (price-(price * 0.15)) :

                                (price>100 && price<= 150) ? (price-(price*0.05)) : 0;

        System.out.println(totalPrice);



        }

    }

