package Class_Day_011;

import java.util.Scanner;

public class ForLoopExample_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter something like \" Hayat ZOR\"");
        String FromScan = sc.nextLine();

        for (int x = 0; x < FromScan.length(); x++){
            if ( FromScan.charAt(x) == 'A' || FromScan.charAt(x)== 'a' ){ // If the string contains A,

                FromScan = FromScan.toUpperCase();

            }else {
                FromScan = FromScan.toLowerCase();

            }


        }
        System.out.println(FromScan);
    }
}
