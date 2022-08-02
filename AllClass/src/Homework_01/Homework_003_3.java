package Homework_01;

public class Homework_003_3 {

    public static void main(String[] args) {
        int x = 0 ;

        String result;

        if (x == 0){

            result = " Number is neither negative nor positive, its equal to zero";
            System.out.println(result);
        } else if (x>0) {
            result = " Number is POSITIVE";
            System.out.println(result);

        } else if (x<0) {
            result = "Number is NEGATIVE";
            System.out.println(result);

        }
        else System.out.println("No input found");

    }

}
