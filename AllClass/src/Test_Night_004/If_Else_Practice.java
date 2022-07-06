package Test_Night_004;

import java.util.logging.SocketHandler;

public class If_Else_Practice {

    public static void main(String[] args) {

        String userName2 = "askjdnaskjdnkjas";
        String password = "password-pas";


        int userNameLenght = userName2.length();
        int passwordLenght = password.length();

        if ( userNameLenght<7 && passwordLenght<8 ){
            System.out.println(userName2 + passwordLenght + " is not long enought to create a new account ");
        }

        else if ( userNameLenght>30 && passwordLenght> 30 ) {
            System.out.println(userNameLenght + " or "   + passwordLenght + " too long please try something shorter ");

        }

        else  {
            System.out.println("You succesfully create your account");
        }

        System.out.println("**************************");

        //
        int item1 = 1013 ;
        int item2 = -1023 ;
        int item3 = 1322 ;
        int item4 = 1231 ;
        int item5 = -3341 ;
        int item6 = -1231;

        boolean item1Value = item1<item2 && item1<item3 && item1<item4 && item1<item5 && item1<item6;
        boolean item2Value = item2<item1 && item2<item3 && item2<item4 && item2<item5 && item2<item6;
        boolean item3Value = item3<item1 && item3<item2 && item3<item4 && item3<item5 && item3<item6;
        boolean item4Value = item4<item1 && item4<item2 && item4<item3 && item4<item5 && item4<item6;
        boolean item5Value = item5<item1 && item5<item2 && item5<item3 && item5<item4 && item5<item6;
        boolean item6Value = item6<item1 && item6<item2 && item6<item3 && item6<item4 && item6<item5;

        if (item1Value){
            System.out.println( item1 + " Item 1 is the cheapest ");
        } else if (item2Value) {
            System.out.println( item2 + " Item 2 is the cheapest ");

        }
        else if (item3Value) {
            System.out.println( item3 + " Item 3 is the cheapest ");

        }
        else if (item4Value) {
            System.out.println( item4 + " Item 4 is the cheapest ");

        }
        else if (item5Value) {
            System.out.println( item5 + " Item 5 is the cheapest ");

        }
        else if (item6Value) {
            System.out.println( item6 + " Item 6 is the cheapest ");

        }
        else {
            System.out.println(" We dont have any cheap product ");
        }

        System.out.println("************************************");



        int a = -10;
        int b = --a + a++ - a + --a * 2 + 10 / 2 - 10 % 3 ;


        System.out.println(b);
















    }



    }


