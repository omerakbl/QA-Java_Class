package Team_01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int input = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= input; i+=2) {


            if (i != 9 || i != 11 || i != 23 || i != 35){
                result =result+i;

            }
            System.out.println(result);

        }

    }
}

