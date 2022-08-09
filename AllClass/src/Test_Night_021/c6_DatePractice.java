package Test_Night_021;

import java.time.LocalDate;

public class c6_DatePractice {

    // create a method that check today date amd compare the date you are passsing
    // if it matches iw will print Happy Birthday
    // if it is not "Not Today I am Sorry"

    public static void happyBirthday(int year,int month, int day){

        LocalDate birthday = LocalDate.of(year,month,day);
        LocalDate todayDate = LocalDate.now();

        int month2 = todayDate.getMonthValue();
        int day2 = todayDate.getDayOfMonth();
        int year2 = todayDate.getYear();

        if (month == month2 && day == day2){
            System.out.println("\n\t Today is your birthday ");
            System.out.println("\t\t\t Happy Birthday ");
        }else {
            System.out.println("Not Today I am Sorry");
        }


    }

    public static void main(String[] args) {
        happyBirthday(1997,10,19);
    }
}
