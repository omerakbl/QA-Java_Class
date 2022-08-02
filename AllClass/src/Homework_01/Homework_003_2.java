package Homework_01;

public class Homework_003_2 {
    public static void main(String[] args) {

        int x = 100;
        int y = -100;
        int z = 0;

        String result;


        if (x>y && x>z){

            result = "x = " + x + " x is largest number between x , y , z";
            System.out.println(result);
        }
        else if (y>x && y>z){

            result = "y = " + y + " y is largest number between x , y , z";
            System.out.println(result);

        }
        else if (z>x && z>y) {
            result = + z + " z is largest number between x , y , z";
            System.out.println(result);
        }
        else System.out.println("None of the number meet requirements ");




    }
}
