package Team_01;

import java.util.Scanner;
import java.util.SortedMap;

public class Homework_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");

        int input = sc.nextInt();

        for (int i = 0; i <= input; i++) {

            if (i % 7 == 0 ){
                continue;
            } else if (i % 2 == 0 || i % 5 == 0) {
                continue;

            }else {
                System.out.println(i);
            }
        }
    }
}
