package HomeWork;

import java.util.Currency;

public class Homework_003_4 {

    public static void main(String[] args) {
        
        int calls = 140;
        int fixValue = 200; // if calls less than 100 fixValue will be effective

        
        if (calls>0 && calls<100){
            System.out.println("You made " +calls  + " calls and " + "your bill is : " + (fixValue) + "$");
        }

        else if (calls>=100 && calls<=150) {
            System.out.println("You made " +calls  + " calls and " + "your bill is : " + ((calls-100)*0.60 +200) + "$");
            
        } else if (calls>150 && calls<=200) {

            System.out.println("You made " +calls  + " calls and " + "your bill is : " + ((calls-150)*0.50+200) + "$");


        } else if (calls>200) {

            System.out.println("You made " +calls  + " calls and " + "your bill is : " + ((calls-200)*0.40+200)+  "$");

        }
        else System.out.println("You didn't make any call on this month, you dont have any bills");


    }
}
