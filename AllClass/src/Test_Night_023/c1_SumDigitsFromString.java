package Test_Night_023;

import java.util.Arrays;

public class c1_SumDigitsFromString {

    public static void main(String[] args) {


        /*
        Write a program that can return the sumn of all the digits from a string
                example:
                    input "Hello 5world a1b2c3"
                    output : 11
                        (1+2+3 + 5 = 11)
                        HINT : on ascii table, the characters between #48 - #57 are digit
         */

        String str = "He8llo 5world a1b2c3";

        char [] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));

        int result = 0;
        int result2 = 0;

        for (char each:arr) {

            if (each >= 48 && each <= 57){ // 0 1 2 3 4 5 6 7 8 9

                result += Integer.parseInt("" + each);
            }

            if (Character.isDigit(each)){
                result2 += Integer.parseInt("" + each);
            }

        }
        System.out.println(result);
        System.out.println(result2);
    }



}
