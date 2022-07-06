package Class_Day_008;

import java.util.Scanner;

public class Next_NextLine {
    public static void main(String[] args) {

        Scanner nameString = new Scanner(System.in);

        System.out.println("Put Fruit on the console ");

        String fruit = nameString.next();

        System.out.println("The thing you put is : " + fruit);

        nameString.nextLine();

        System.out.println("Enter something with space : ");
        String butter = nameString.nextLine();

        System.out.println();
        System.out.println(butter);




    }
}
