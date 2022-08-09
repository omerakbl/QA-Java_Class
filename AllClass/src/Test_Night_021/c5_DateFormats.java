package Test_Night_021;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class c5_DateFormats {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFortmater = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1); // 2022-08-08

        System.out.println(localDate1.format(dateTimeFortmater));


        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("EEEE MMM/dd/yy");

        LocalDate localDate2 = LocalDate.of(2022,10,19);
        System.out.println(localDate2.format(dateTimeFormatter2));

        // E : Name of the day
        // MMM : jan MMMM January
        // yy : 22 yyyy : 2022

        LocalDateTime localDateTime1 = LocalDateTime.of(2000,5,3,20,40,50);
        System.out.println(localDateTime1);

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("EEE, MM/dd / hh:mm a");
        String str2 = localDateTime1.format(dateTimeFormatter3);

        System.out.println(str2);
    }
}
