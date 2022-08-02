package Class_Day_017;

import java.util.Arrays;

public class StringMerhodinArray {
    public static void main(String[] args) {


        String str = "ajajajja jujuju ububuububu";

        String [] name = str.split(" "); // This method will get every substring starting from beginning until it sees char added in the quotes
        // you can not use "?" , "+" , "*"

        System.out.println(Arrays.toString(name));

        System.out.println("*************************");

        String x = "Java is cool";

        String [] k = x.split(""); // It will get every char in the substring but theated as string

        System.out.println(Arrays.toString(k));


    }
}
