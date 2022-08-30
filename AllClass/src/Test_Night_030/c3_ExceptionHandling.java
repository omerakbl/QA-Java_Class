package Test_Night_030;

import java.util.ArrayList;
import java.util.Arrays;

public class c3_ExceptionHandling {


    //there is 2 way to handle exceptions so they dont stop compiler from running
    //first you can use try/catch blocks to handle
    //second you can use throws keyword to handle\

    public static void main(String[] args) {

        System.out.println("Hello");

        // InterruptedException;
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Waiting for 5 second");
        }
        System.out.println("Waiting is done");

        System.out.println("Hello 2");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        try {
            System.out.println(list.get(10)); // unchecked
        }catch (RuntimeException e){
            System.out.println("List doesnt have index 10");

        }

        int number=0;

        while (number<60){
            System.out.println(number);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            number++;
        }


    }
}
