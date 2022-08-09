package Homework_09;

public class Homework_026 {
    public static void main(String[] args) {
        /*
        Write a method that takes the day as an integer such as (1 for Monday, 2 for Tuesday, and so on) and it
        returns a String value indicating "Go To Work" for weekdays and "Go Back to Sleep" weekends. Name your Method as (GotoSleeporWork)
         */
        days(2);
    }
    public static void days(int dayNum){

        String day = "";

        switch (dayNum){
            case 1 : day = "Monday";
                System.out.println("Go to work");
            break;
            case 2 : day = "Tuesday";
                System.out.println("Go to work");
                break;
            case 3 : day = "Wednesday";
                System.out.println("Go to work");
                break;
            case 4 : day = "Thursday";
                System.out.println("Go to work");
                break;
            case 5 : day = "Friday";
                System.out.println("Go to work");
                break;
            case 6 : day = "Saturday";
                System.out.println("Go Back to Sleep");
                break;
            case 7 : day = "Sunday";
                System.out.println("Go Back to Sleep");
                break;
        }

        System.out.println(day);
    }
}
