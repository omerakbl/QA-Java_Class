import java.util.Arrays;
import java.util.Scanner;

public class Homework_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] num = new int[10];
        int sum = 0;

        for (int i = 0; i < num.length; i++) {

            System.out.println("Please enter a number");

            num[i]= sc.nextInt();
            sum += num[i];

        }
        System.out.println(Arrays.toString(num));
        System.out.println("Sum of the number is : " + sum);
    }
}
