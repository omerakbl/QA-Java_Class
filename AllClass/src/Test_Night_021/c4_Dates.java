package Test_Night_021;

import java.time.LocalDate;

public class c4_Dates {

    public static void main(String[] args) {

        // localdate class coming from library import java.time.LocalDate;

        LocalDate localdate1 = LocalDate.of(2022,8,8);

        System.out.println(localdate1);

        LocalDate localdate2 = LocalDate.of(2020,10,19);

        System.out.println(localdate2);

        // isAfter, isBefore

        boolean bool1 = localdate1.isAfter(localdate2);
        boolean bool2 = localdate1.isBefore(localdate2);
        boolean bool3 = localdate1.isEqual(localdate2);


        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);

        LocalDate todayDate = LocalDate.now();

        System.out.println("today is : " + todayDate);

        String str1 = localdate1.toString(); // 2022-08-08

        str1 = str1.replace("-",".");
        System.out.println(str1);



    }
}
